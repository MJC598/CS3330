/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package audioviz;

import static java.lang.Integer.min;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Matthew Carroll
 * 
 */
public class Mjc6r9MyVisualizer implements Visualizer {
    
    //Fields
    public final String name = "Mjc6r9 My Visualizer";
    private final Double bandHeightPercentage = 1.3;
    
    private Integer numBands;
    private AnchorPane vizPane;
    
    private String vizPaneInitialStyle = "";
    
    private Double vizWidth = 0.0;
    private Double vizHeight = 0.0;
    
    private Double bandWidth = 0.0;
    private Double bandHeight = 0.0;
    private Double halfBandHeight = 0.0;
    private final double minHeight = 10.0;
//    private Ellipse left;
//    private Ellipse right;
    private static Rectangle clip;
    private static int counter = 1;
    
    private final Double hue = 250.0;
    
//    public Color startColor = Color.BLACK;
    
    private Rectangle[] rectangles;
    private Ellipse[] ellipses;
//    private boolean count = false;
    private final double minRadius = 10.0;
    private Double magnitudeOffset = 70.0;
    
    
    
    //Default Constructor
    public Mjc6r9MyVisualizer(){
        
    }
    
    //Start of Methods
    @Override
    public void start(Integer numBands, AnchorPane vizPane){
        end();
        
        vizPaneInitialStyle = vizPane.getStyle();
        
        this.numBands = numBands;
        this.vizPane = vizPane;
        
        vizHeight = vizPane.getHeight();
        vizWidth = vizPane.getWidth();
        
        bandWidth = vizWidth / numBands;
        bandHeight = vizHeight * bandHeightPercentage;
        halfBandHeight = bandHeight / 2;
        
        clip = new Rectangle(vizWidth, vizHeight);
        clip.setLayoutX(0);
        clip.setLayoutY(0);
        vizPane.setClip(clip);
//        clip2 = new Ellipse(vizWidth, vizHeight);
//        clip2.setLayoutX(0);
//        clip2.setLayoutY(0);
//        vizPane.setClip(clip2);
        
//        left = new Ellipse(vizWidth/2, vizHeight/2);
//        left.setLayoutX(0);
//        left.setLayoutY(vizHeight/2);
//        left.setFill(Color.hsb(startHue, 1.0, 1.0, 1.0));
//        
//        right = new Ellipse(vizWidth/2, vizHeight/2);
//        right.setLayoutX(vizWidth);
//        right.setLayoutY(vizHeight/2);
//        right.setFill(Color.hsb(startHue, 1.0, 1.0, 1.0));
        
//        if(count == false){
//            vizPane.getChildren().add(left);
//            vizPane.getChildren().add(right);
//            count = true;
//        }
        ellipses = new Ellipse[numBands];
        rectangles = new Rectangle[numBands];
        
        for (int i = 0; i < numBands; i++) {
            Rectangle rectangle = new Rectangle();
            rectangle.setX(bandWidth / 2 + bandWidth * i);
            rectangle.setY(vizHeight / 2);
            rectangle.setWidth(bandWidth / 2);
            rectangle.setHeight(minHeight);
            rectangle.setFill(Color.hsb(hue, 1.0, 1.0, 1.0));
            vizPane.getChildren().add(rectangle);
            rectangles[i] = rectangle;
            Ellipse ellipse = new Ellipse();
            ellipse.setCenterX(vizWidth / 2);
            ellipse.setCenterY(vizHeight / 4);
            ellipse.setRadiusX(minRadius);
            ellipse.setRadiusY(minRadius);
            ellipse.setFill(Color.hsb(360, 1.0, 1.0, 1.0));
            vizPane.getChildren().add(ellipse);
            ellipses[i] = ellipse;
            
        }
    }
    
    @Override
    public void end(){
        if (rectangles != null) {
            for (Rectangle rec : rectangles) {
                vizPane.getChildren().remove(rec);
            }
        if (ellipses != null) {
            for (Ellipse ellipse : ellipses) {
                vizPane.getChildren().remove(ellipse);
            }
        
            ellipses = null;
        }
        clip = null;
//            vizPane.getChildren().remove(left);
//            vizPane.getChildren().remove(right);
//            I'd much rather be doing something other than javafx
            rectangles = null;
            vizPane.setClip(null);
            vizPane.setStyle(vizPaneInitialStyle);
//            count = false;
        }
        counter = 1;
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public void update(double timestamp, double duration, float[] magnitudes, float[] phases){
        
        if (rectangles == null || ellipses == null) {
            return;
        }
        Integer num = min(ellipses.length, magnitudes.length);
//        clip.setRotate(45 * counter);
        
        for (int i = 0; i < num; i++) {
            ellipses[i].setRadiusX(magnitudeOffset + magnitudes[i]);
            ellipses[i].setRadiusY(magnitudeOffset + magnitudes[i]);
            
//            ellipses[i].setTranslateY((Math.abs(magnitudes[i]) * 5) - 300);
            ellipses[i].setFill(Color.hsb(360 - (magnitudes[i] * -6.0), 1.0, 1.0, 1.0));
            if(i%2 == 0){
                rectangles[i].setFill(Color.hsb(hue - (magnitudes[i] * -6.0), 1.0, 1.0, 1.0));
                rectangles[i].setHeight( ((60.0 + magnitudes[i])/60.0) * halfBandHeight + minHeight);
            }
            else{
                rectangles[i].setFill(Color.hsb(hue + (magnitudes[i] * -6.0), 1.0, 1.0, 1.0));
                rectangles[i].setHeight(((60.0 + magnitudes[i])/50.0) * halfBandHeight + minHeight);
            }
            
        }
        
        
//        for (int i = 0; i < num; i++) {
//            rectangles[i].setHeight( ((60.0 + magnitudes[i])/60.0) * halfBandHeight + minHeight);
//            rectangles[i].setFill(Color.hsb(startHue - (magnitudes[i] * -6.0), 1.0, 1.0, 1.0));  
//        }
//        vizPane.setClip(clip);
        
        Double otherHue = ((20.0 + magnitudes[0])/60.0) * 360;
        vizPane.setStyle("-fx-background-color: hsb(" + otherHue + ", 20%, 100%)" );
    }
    
    public static void rotatePane(){
        clip.setRotate(45 * counter);
    }
    
    public static void upCounter(){
        counter++;
    }
}
