/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjc6r9stopwatch;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author mcarroll
 */
public class Mjc6r9Stopwatch extends Application {
    
    private String appName = "Mjc6r9Stopwatch";
    
    @Override
    public void start(Stage primaryStage) {
        Mjc6r9AnalogStopwatch clock = new Mjc6r9AnalogStopwatch();
        
        Scene scene = new Scene(clock.getRootContainer(), 
                                    clock.getWidth(), 
                                    clock.getHeight());
        
        primaryStage.setTitle(appName);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
