/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjc6r9mvcstopwatchfxml;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 *
 * @author mcarroll
 */
public class Mjc6r9Analog {
    
    private KeyFrame keyFrame;
    private Timeline timeline;
    private double tickTimeInSeconds = 0.01;
    private double angleDeltaPerSeconds = 6.0;
    private double secondsElapsed;
    private double rotation;
    
    public Mjc6r9Analog(){
        
    }
    
    public double getAngleDeltaPerSeconds(){
        return angleDeltaPerSeconds;
    }
    
    public double getSecondsElapsed(){
        return secondsElapsed;
    }
    
    public void setSecondsElapsed(double num){
        secondsElapsed = num;
    }
    
    public double getTickTimeInSeconds(){
        return tickTimeInSeconds;
    }
    
    public void setRotation(double num){
        rotation = num;
    }
    
    public double getRotation(){
        return rotation;
    }
    
    public Timeline getTimeline(){
        return timeline;
    }
    
    public void stopTimeline(){
        timeline.stop();
    }
    
    public void setTimeline(Timeline tl){
        timeline = tl;
    }
    
    public boolean isRunning(){
        if(timeline != null){
            if(timeline.getStatus() == Animation.Status.RUNNING){
                return true;
            }
        }
        return false;
    }
    
    public void handleStartStopButton(ActionEvent event){
        if(isRunning()){
               stop();
           }
           else{
               start();
           }
    }
    public void handleLapResetButton(ActionEvent event){
        if(!isRunning()){
                timeline.stop();
                secondsElapsed = 0;
            }
    }
    
    public void stop(){
        timeline.stop();
    }

    public void start(){
        timeline.play();
    }
    
}
