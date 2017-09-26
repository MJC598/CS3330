/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjc6r9notifier;

import java.time.LocalDateTime;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author mcarroll
 */
public class Mjc6r9Notifier extends Application {
    
    public String title = "Notifier";
    public int width = 420;
    public int height = 250;
    private String pawprint;
    private LocalDateTime ltd;
    private TextField textfield;
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle(title);
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        
        textfield = new TextField();
        
        grid.add(textfield, 0, 0);
        
        
        Button notify = new Button("Notify");
        Button clear = new Button("Clear");
        Button print = new Button("Print");
        Button alert = new Button("Alert");
        notify.setOnAction((ActionEvent event) -> {
            setPawprint("MJC6R9");
            setLTD(LocalDateTime.now());
            invokeMe();
        });
        
        clear.setOnAction((ActionEvent event) -> {
            textfield.setText("");
        });
        
        print.setOnAction((ActionEvent event) -> {
            String text = textfield.getText();
            System.out.println(text);
        });
        
        alert.setOnAction((ActionEvent event) -> {
            Alert alertBox = new Alert(AlertType.CONFIRMATION);
            String text = textfield.getText();
            alertBox.setTitle("Alert");
            alertBox.setHeaderText(text);
            //alertBox.setContentText(text);
            alertBox.show();
        });
        
        notify.setMaxWidth(Double.MAX_VALUE);
        clear.setMaxWidth(Double.MAX_VALUE);
        print.setMaxWidth(Double.MAX_VALUE);
        alert.setMaxWidth(Double.MAX_VALUE);
        
        VBox buttonHolder = new VBox(10);
        buttonHolder.setPadding(new Insets(0, 20, 10, 20));
        buttonHolder.getChildren().addAll(notify, clear, print, alert);
        
        grid.add(buttonHolder, 0, 1);
        
        
        Scene scene = new Scene(grid, width, height);
        primaryStage.setScene(scene);        
        primaryStage.show();
        
    }
    
    public void setLTD(LocalDateTime ltd){
        this.ltd = ltd;
    }
    
    public void setPawprint(String pawprint){
        this.pawprint = pawprint;
    }
    
    public String getPawprint(){
        return this.pawprint;
    }
    
    public LocalDateTime getLTD(){
        return this.ltd;
    }
    
    public void invokeMe(){
        textfield.setText("You have been notified by " + getPawprint() + 
                " on " + getLTD());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
