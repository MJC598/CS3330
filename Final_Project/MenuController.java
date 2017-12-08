/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjc6r9converter;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author mcarroll
 */
public class MenuController extends Switchable implements Initializable {

    @FXML
    private Button mass;
    @FXML
    private Button length;
    @FXML
    private Button volume;
    @FXML
    private Button density;
    @FXML
    private Button force;
    @FXML
    private Button pressure;
    @FXML
    private Button energy;
    @FXML
    private Button power;
    @FXML
    private Button about;
    
    private Stage primaryStage;
    
    @FXML
    private void handleMassButtonAction(ActionEvent event){
        Switchable.switchTo("MassConverter");
    }
    @FXML
    private void handleLengthButtonAction(ActionEvent event){
        Switchable.switchTo("LengthConverter");
    }
    @FXML
    private void handleVolumeButtonAction(ActionEvent event){
        Switchable.switchTo("VolumeConverter");
    }
    @FXML
    private void handleDensityButtonAction(ActionEvent event){
        Switchable.switchTo("DensityConverter");
    }
    @FXML
    private void handleForceButtonAction(ActionEvent event){
        Switchable.switchTo("ForceConverter");
    }
    @FXML
    private void handlePressureButtonAction(ActionEvent event){
        Switchable.switchTo("PressureConverter");
    }
    @FXML
    private void handleEnergyButtonAction(ActionEvent event){
        Switchable.switchTo("EnergyConverter");
    }
    @FXML
    private void handlePowerButtonAction(ActionEvent event){
        Switchable.switchTo("PowerConverter");
    }
    @FXML
    private void handleAboutButtonAction(ActionEvent event){
        Switchable.switchTo("About");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
