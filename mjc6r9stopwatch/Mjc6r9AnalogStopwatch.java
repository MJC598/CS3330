/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjc6r9stopwatch;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.util.Duration;

/**
 *
 * @author mcarroll
 */
public class Mjc6r9AnalogStopwatch {
    private double tickTimeInSeconds = 0.01; //change the resolution
    private double angleDeltaPerSeconds = 6.0;
    private double secondsElapsed;
    private Timeline timeline;
    private KeyFrame keyFrame;
    private int minutes = 0;
    private int seconds = 0;
    private int milliseconds = 0;
    private int hours = 0;
    private StackPane rootContainer;
    private StackPane picHolder;    
    private ImageView dialImageView;
    private ImageView handImageView;
    private String digitalTime;
    private Image dialImage;
    private Image handImage;
    private String dialImageName = "clockface.png";
    private String handImageName = "hand.png"; 
    private VBox holder;
    private Label digi;
    private int lapCounter = 0;
    private String fontStyle = "Comic Sans MS";
    private boolean tickButtonPressed = false;
    
    
    public Mjc6r9AnalogStopwatch(){
        setupUI();
        setupTimer();
    }
    
    public void setupUI(){
        rootContainer = new StackPane();
        picHolder = new StackPane();
        dialImageView = new ImageView();
        handImageView = new ImageView();
        digitalTime = String.format("%02d:%02d:%02d:%02d", hours, minutes, seconds, milliseconds);
        digi = new Label(digitalTime);
        digi.setFont(Font.font(fontStyle, FontWeight.BOLD, 26));
        digi.setAlignment(Pos.TOP_CENTER);
        
        dialImage = new Image(getClass().getResourceAsStream(dialImageName));
        handImage = new Image(getClass().getResourceAsStream(handImageName));
        
        dialImageView.setImage(dialImage);
        handImageView.setImage(handImage);
        
        
        HBox buttonBox = new HBox(15);
        buttonBox.setSpacing(10);
        buttonBox.setAlignment(Pos.BOTTOM_CENTER);
        buttonBox.setPadding(new Insets(25, 25, 25, 25));
        Button lapResetButton = new Button("Lap");
        Button stopStartButton = new Button("Start");
        stopStartButton.setMaxWidth(Double.MAX_VALUE);
        lapResetButton.setMaxWidth(Double.MAX_VALUE);
        picHolder.getChildren().addAll(dialImageView, handImageView);
        buttonBox.getChildren().addAll(stopStartButton, lapResetButton);
        holder = new VBox(15, digi, picHolder, buttonBox);
        holder.setAlignment(Pos.CENTER);
        
        rootContainer.getChildren().add(holder);
        
        holder.toFront();
        
        stopStartButton.setOnAction((ActionEvent event) -> {           
           if(isRunning()){
               stopStartButton.setText("Start");
               lapResetButton.setText("Reset");
               stop();
           }
           else{
               stopStartButton.setText("Stop");
               lapResetButton.setText("Lap");
               start();
           }
        });
        
        lapResetButton.setOnAction((ActionEvent event) -> {
            if(!isRunning()){
                timeline.stop();
                handImageView.setRotate(0);
                secondsElapsed = 0;
                minutes = 0;
                seconds = 0;
                milliseconds = 0;
                hours = 0;
                digitalTime = String.format("%02d%02d:%02d:%02d", hours, minutes, seconds, milliseconds);
                digi.setText(digitalTime);
                lapCounter = 0;
                System.out.println("");
                
                lapResetButton.setText("Lap");
            }
            else{
                lapCounter++;
                digitalTime = String.format("Lap %d %02d:%02d:%02d",lapCounter, minutes, seconds, milliseconds);
                System.out.println(digitalTime);
            }
        });
    }
    
    public void stop(){
        timeline.stop();
    }
    
    public void setupTimer(){
        if(isRunning()){
            timeline.stop();
        }
        
        keyFrame = new KeyFrame(Duration.millis(tickTimeInSeconds * 1000), (ActionEvent event) ->{
            update();
        });
        timeline = new Timeline(keyFrame);
        timeline.setCycleCount(Animation.INDEFINITE);
    }
    
    public boolean isRunning(){
        if(timeline != null){
            if(timeline.getStatus() == Animation.Status.RUNNING){
                return true;
            }
        }
        return false;
    }
    
    private void update(){
        secondsElapsed += tickTimeInSeconds;
        double rotation = secondsElapsed * angleDeltaPerSeconds;
        handImageView.setRotate(rotation);
        milliseconds++;
        if(milliseconds % 100 == 0){
            seconds++;
            milliseconds = 0;
//            System.out.println(seconds);
            if(seconds % 60 == 0){
                minutes++;
                seconds = 0;
                if(minutes % 60 == 0){
                    hours++;
                    minutes = 0;
                }
//                System.out.println(minutes);
            }
        }
        digitalTime = String.format("%02d:%02d:%02d:%02d", hours, minutes, seconds, milliseconds);
        digi.setText(digitalTime);

        
    }
    
    public void start(){
        timeline.play();
    }
    
    /*
        Return tpe is parent so that any type of JavaFX Container can be
        returned. StackPane, GridPane, AnchorPane, etc. all inherit from Parent
    */
    
    public Parent getRootContainer(){
        return rootContainer;
    }
    
    public Double getWidth(){
        if(dialImage != null){
            return 1.5 * dialImage.getWidth();
        }
        else{
            return 0.0;
        }
    }
    
    public Double getHeight(){
        if(holder != null){
            return holder.getHeight();
        }
        else{
            return 0.0;
        }
    }
    
    public void setTickTimeInSeconds(Double tickTimeInSeconds){
        this.tickTimeInSeconds = tickTimeInSeconds;
        setupTimer();
        
        /*if(!isRunning()){
            timeline.play();
        }*/
    }
}
