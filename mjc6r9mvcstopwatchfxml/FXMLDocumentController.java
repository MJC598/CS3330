/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjc6r9mvcstopwatchfxml;

import java.net.URL;
import java.text.ParseException;
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
    private StackPane root;
    @FXML
    private VBox holder;
    @FXML
    private StackPane analogHolder;
    @FXML
    private ImageView analogFace;
    @FXML
    private ImageView hand;
    @FXML
    private Label digital;
    @FXML
    private HBox buttons;
    @FXML
    private Button startStopButton;
    @FXML
    private Button lapResetButton;
    
    private Mjc6r9Analog analog;
    private Mjc6r9Digital digitalClock;
    private KeyFrame keyFrame;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        analog = new Mjc6r9Analog();
        setupAnalogTimer(); 
        digitalClock = new Mjc6r9Digital();
        setupDigiTimer();
    }   
    
    public void setupAnalogTimer(){    
        if(analog.isRunning()){
            analog.stopTimeline();
        }
        
            
        keyFrame = new KeyFrame(Duration.millis(analog.getTickTimeInSeconds() * 1000), (ActionEvent event) ->{
            analog.setSecondsElapsed(analog.getTickTimeInSeconds() + analog.getSecondsElapsed());
            analog.setRotation(analog.getSecondsElapsed() * analog.getAngleDeltaPerSeconds());
            hand.setRotate(analog.getRotation());
            
        });
        analog.setTimeline(new Timeline(keyFrame));
        analog.getTimeline().setCycleCount(Animation.INDEFINITE);
    }
        
    public void setupDigiTimer(){
        if(digitalClock.isRunning()){
            digitalClock.stopTimeline();
        }
        
        keyFrame = new KeyFrame(Duration.millis(analog.getTickTimeInSeconds() * 1000), (ActionEvent event) ->{
            digitalClock.upMilliseconds();
            if(digitalClock.getMilliseconds() % 100 == 0){
                digitalClock.upSeconds();
                digitalClock.setMilliseconds(0);
                if(digitalClock.getSeconds() % 60 == 0){
                    digitalClock.upMinutes();
                    digitalClock.setSeconds(0);
                    if(digitalClock.getMinutes() % 60 == 0){
                        digitalClock.upHours();
                        digitalClock.setMinutes(0);
                    }
                }
            }
//        String time = String.format("%02d:%02d:%02d:%02d", digitalClock.hours,
//                digitalClock.minutes, 
//                digitalClock.seconds, 
//                digitalClock.milliseconds);
        
        digital.setText(String.format("%02d:%02d:%02d:%02d", digitalClock.getHours(),
                digitalClock.getMinutes(), 
                digitalClock.getSeconds(), 
                digitalClock.getMilliseconds()));
        });
        
        digitalClock.setTimeline(new Timeline(keyFrame));
        digitalClock.getTimeline().setCycleCount(Animation.INDEFINITE);
    }
    
    @FXML
    private void handleStartStopButton(ActionEvent event){
        analog.handleStartStopButton(event);
        digitalClock.handleStartStopButton(event); 
        startStopButton.setText(digitalClock.getStartStopText());
        lapResetButton.setText(digitalClock.getLapResetText());
        
    }
    
    @FXML
    private void handleLapResetButton(ActionEvent event){
        analog.handleLapResetButton(event);
        if(!digitalClock.isRunning()){
            analog.handleLapResetButton(event);
            digitalClock.handleLapResetButton(event);
            hand.setRotate(0);
            digital.setText(digitalClock.getDigitalTime());
            lapResetButton.setText(digitalClock.getLapResetText());
            System.out.println("");
        }
        else{
            analog.handleLapResetButton(event);
            digitalClock.handleLapResetButton(event);
            System.out.print("Lap " + digitalClock.getLapCounter());
            System.out.println(" " + digitalClock.getDigitalTime());
//            System.out.println(" " + digitalClock.findLap(digitalClock.getDigitalTime(), digitalClock.getLastLap()));
        }        
    }
    
}
