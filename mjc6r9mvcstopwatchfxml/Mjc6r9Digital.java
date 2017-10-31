/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjc6r9mvcstopwatchfxml;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.animation.Animation;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;

/**
 *
 * @author mcarroll
 */
public class Mjc6r9Digital {
    private Timeline timeline;
    private double tickTimeInSeconds = 0.01;
    private double angleDeltaPerSeconds = 6.0;
    private String lastLap = "00:00:00:00";
    private int minutes = 0;
    private int seconds = 0;
    private int milliseconds = 0;
    private int hours = 0;
    private int lapCounter = 0;
    private int timeMinutes = 0;
    private int timeSeconds = 0;
    private int timeHours = 0;
    private String digitalTime;
    private String findLapTime;
    private String startStopText;
    private String lapResetText;
    
    public Mjc6r9Digital(){

    }
    
    public String getDigitalTime(){
        return digitalTime;
    }
    
    public int getLapCounter(){
        return lapCounter;
    }
    
    public int getHours(){
        return hours;
    }
    
    public void upHours(){
        hours++;
    }
    
    public void setHours(int num){
        hours = num;
    }
    
    public int getSeconds(){
        return seconds;
    }
    
    public void upSeconds(){
        seconds++;
    }
    
    public void setSeconds(int num){
        seconds = num;
    }
    
    public int getMinutes(){
        return minutes;
    }
    
    public void upMinutes(){
        minutes++;
    }
    
    public void setMinutes(int num){
        minutes = num;
    }
    
    public int getMilliseconds(){
        return milliseconds;
    }
    
    public void upMilliseconds(){
        milliseconds++;
    }
    
    public void setMilliseconds(int num){
        milliseconds = num;
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
    
    public String getStartStopText(){
        return startStopText;
    }
    
    public String getLapResetText(){
        return lapResetText;
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
               startStopText = "Start";
               lapResetText = "Reset";
               stop();
           }
           else{
               startStopText = "Stop";
               lapResetText = "Lap";
               start();
           }
    }
    
    public void handleLapResetButton(ActionEvent event){
        if(!isRunning()){
                timeline.stop();
                minutes = 0;
                seconds = 0;
                milliseconds = 0;
                hours = 0;
                digitalTime = String.format("%02d:%02d:%02d:%02d", hours, minutes, seconds, milliseconds);
                lapCounter = 0;
                lapResetText = "Lap";
            }
            else{
                lapCounter++;
                digitalTime = String.format("%02d:%02d:%02d:%02d", hours, minutes, seconds, milliseconds);
                lastLap = digitalTime;
            }
    }
    
    public String getLastLap(){
        return lastLap;
    }
    
    //This part is attempting to parse the String correctly so that I can subtract the second String from the first
    //to get accurate laps. Unfortunately it does not work correctly and I have other stuff I need to work on
    //rather than endlessly tearing out my hair like I've been doing for the past 3 days. Also considering it's how 
    //Professor Wergeles does it in his examples for the past 3 challenges it's kinda rediculuous that we are now 
    //being told to parse ints from strings, subtract them, then throw them back into a strange date format that halfway works
    
//    public String findLap(String digitalTime, String lastLap) throws ParseException{
//        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss:SS");
//        Date time1 = format.parse(digitalTime);
//        Date time2 = format.parse(lastLap);
//        long timeDifference = time2.getTime() - time1.getTime();
//        while(timeDifference >= 100){
//            timeDifference /= 100;
//            timeSeconds++;
//            if(timeSeconds % 60 == 0){
//                timeMinutes++;
//                timeSeconds = 0;
//                if(timeMinutes % 60 == 0){
//                    timeHours++;
//                    timeMinutes = 0;
//                }
//            }
//        }
//        findLapTime = String.format("%02d:%02d:%02d:%02d", timeHours, timeMinutes, timeSeconds, timeDifference);
//        return findLapTime;
//    }
    
    public void stop(){
        timeline.stop();
    }

    public void start(){
        timeline.play();
    }
}
