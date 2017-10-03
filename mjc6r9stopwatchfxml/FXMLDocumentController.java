/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjc6r9stopwatchfxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

/**
 *
 * @author mcarroll
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label digital;
    @FXML
    private Button startStopButton; 
    @FXML 
    private Button lapResetButton;
    @FXML
    private ImageView hand;
    @FXML
    private StackPane root;
    @FXML
    private VBox holder;
    @FXML
    private StackPane analogHolder;
    @FXML
    private ImageView analogFace;
    @FXML
    private HBox buttons;
    
    private double tickTimeInSeconds = 0.01; //change the resolution
    private double angleDeltaPerSeconds = 6.0;
    private double secondsElapsed;
    private int minutes = 0;
    private int seconds = 0;
    private int milliseconds = 0;
    private int hours = 0;
    private int lapCounter = 0;
    private String digitalTime;
    private KeyFrame keyFrame;
    private Timeline timeline;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        // TODO
        setupTimer();
    } 
    
    @FXML
    private void handleStartStopButton(ActionEvent event){
        if(isRunning()){
               startStopButton.setText("Start");
               lapResetButton.setText("Reset");
               stop();
           }
           else{
               startStopButton.setText("Stop");
               lapResetButton.setText("Lap");
               start();
           }
    }
    
    @FXML
    private void handleLapResetButton(ActionEvent event){
        if(!isRunning()){
                timeline.stop();
                hand.setRotate(0);
                secondsElapsed = 0;
                minutes = 0;
                seconds = 0;
                milliseconds = 0;
                hours = 0;
                digitalTime = String.format("%02d%02d:%02d:%02d", hours, minutes, seconds, milliseconds);
                digital.setText(digitalTime);
                lapCounter = 0;
                System.out.println("");
                
                lapResetButton.setText("Lap");
            }
            else{
                lapCounter++;
                digitalTime = String.format("Lap %d %02d:%02d:%02d",lapCounter, minutes, seconds, milliseconds);
                System.out.println(digitalTime);
            }
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
        hand.setRotate(rotation);
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
        digital.setText(digitalTime);

        
    }

    public void stop(){
        timeline.stop();
    }

    public void start(){
        timeline.play();
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
}
