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
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

/**
 *
 * @author mcarroll
 */
public class VolumeConverterController extends Switchable implements Initializable{
    
    @FXML
    private Label inputLabel;
    @FXML
    private Label outputLabel;
    @FXML
    private Button clear;
    @FXML
    private Button zero;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button decimal;
    @FXML
    private Button menu;
    @FXML
    private MenuButton fromUnits;
    @FXML
    private MenuButton toUnits;
    @FXML
    private MenuItem inMMI;
    @FXML
    private MenuItem inFtMI;
    @FXML
    private MenuItem lMI;
    @FXML
    private MenuItem cmMI;
    @FXML
    private MenuItem mLMI;
    @FXML
    private MenuItem ftMI;
    @FXML
    private MenuItem imGalMI;
    @FXML
    private MenuItem galMI;
    @FXML
    private MenuItem qtMI;
    @FXML
    private MenuItem inMI;
    @FXML
    private MenuItem mMI;
    
    VolumeConverter volumeConverter = new VolumeConverter();
    private String fromText = "";
    private String toText = "";
    
    //NUMBERS
    
    
    @FXML
    private void handleNineButtonAction(ActionEvent event) {
        if(volumeConverter.getHolderValue() == 0.0){
            volumeConverter.setHolderValueAsString("9");
        }
        else{
            volumeConverter.setHolderValueAsString(volumeConverter.getHolderValueAsString() + "9");
        }
        inputLabel.setText(volumeConverter.getHolderValueAsString());
    }
    @FXML
    private void handleEightButtonAction(ActionEvent event) {
        if(volumeConverter.getHolderValue() == 0.0){
            volumeConverter.setHolderValueAsString("8");
        }
        else{
            volumeConverter.setHolderValueAsString(volumeConverter.getHolderValueAsString() + "8");
        }
        inputLabel.setText(volumeConverter.getHolderValueAsString());
    }
    @FXML
    private void handleSevenButtonAction(ActionEvent event) {
        if(volumeConverter.getHolderValue() == 0.0){
            volumeConverter.setHolderValueAsString("7");
        }
        else{
            volumeConverter.setHolderValueAsString(volumeConverter.getHolderValueAsString() + "7");
        }
        inputLabel.setText(volumeConverter.getHolderValueAsString());
    }
    @FXML
    private void handleSixButtonAction(ActionEvent event) {
        if(volumeConverter.getHolderValue() == 0.0){
            volumeConverter.setHolderValueAsString("6");
        }
        else{
            volumeConverter.setHolderValueAsString(volumeConverter.getHolderValueAsString() + "6");
        }
        inputLabel.setText(volumeConverter.getHolderValueAsString());
    }
    @FXML
    private void handleFiveButtonAction(ActionEvent event) {
        if(volumeConverter.getHolderValue() == 0.0){
            volumeConverter.setHolderValueAsString("5");
        }
        else{
            volumeConverter.setHolderValueAsString(volumeConverter.getHolderValueAsString() + "5");
        }
        inputLabel.setText(volumeConverter.getHolderValueAsString());
    }
    @FXML
    private void handleFourButtonAction(ActionEvent event) {
        if(volumeConverter.getHolderValue() == 0.0){
            volumeConverter.setHolderValueAsString("4");
        }
        else{
            volumeConverter.setHolderValueAsString(volumeConverter.getHolderValueAsString() + "4");
        }
        inputLabel.setText(volumeConverter.getHolderValueAsString());
    }
    @FXML
    private void handleThreeButtonAction(ActionEvent event) {
        if(volumeConverter.getHolderValue() == 0.0){
            volumeConverter.setHolderValueAsString("3");
        }
        else{
            volumeConverter.setHolderValueAsString(volumeConverter.getHolderValueAsString() + "3");
        }
        inputLabel.setText(volumeConverter.getHolderValueAsString());
    }
    @FXML
    private void handleTwoButtonAction(ActionEvent event) {
        if(volumeConverter.getHolderValue() == 0.0){
            volumeConverter.setHolderValueAsString("2");
        }
        else{
            volumeConverter.setHolderValueAsString(volumeConverter.getHolderValueAsString() + "2");
        }
        inputLabel.setText(volumeConverter.getHolderValueAsString());
    }
    @FXML
    private void handleOneButtonAction(ActionEvent event) {
        if(volumeConverter.getHolderValue() == 0.0){
            volumeConverter.setHolderValueAsString("1");
        }
        else{
            volumeConverter.setHolderValueAsString(volumeConverter.getHolderValueAsString() + "1");
        }
        inputLabel.setText(volumeConverter.getHolderValueAsString());
    }
    @FXML
    private void handleZeroButtonAction(ActionEvent event) {
        if(volumeConverter.getHolderValue() == 0.0){
            volumeConverter.setHolderValueAsString("0");
        }
        else{
            volumeConverter.setHolderValueAsString(volumeConverter.getHolderValueAsString() + "0");
        }
        inputLabel.setText(volumeConverter.getHolderValueAsString());
    }
    
    
    //NUMBERS
    
    @FXML
    private void handleClearButtonAction(ActionEvent event) {
        volumeConverter.sethValue("0.0");
        volumeConverter.setInputNumber(0.0);
        volumeConverter.setOutputNumber(0.0);
        volumeConverter.setHolderValue(0.0);
        volumeConverter.setDecimalCheck(false);
        inputLabel.setText("");
        outputLabel.setText("");
    }
    
    @FXML
    private void handleDecimalButtonAction(ActionEvent event) {
        if(volumeConverter.getHolderValue() == 0.0 && volumeConverter.isDecimalCheck() == false){
            volumeConverter.setHolderValueAsString("0.");
        }
        else{
            if(volumeConverter.isDecimalCheck() == false){
                volumeConverter.setHolderValueAsString(volumeConverter.getHolderValueAsString() + ".");
                volumeConverter.setDecimalCheck(true);
            }
        }
        inputLabel.setText(volumeConverter.getHolderValueAsString());
    }
    
    //MENU ITEM NUMBERS
    
    @FXML
    private void handleinMMIAction(ActionEvent event){
        fromUnits.setText("m cubed");
        fromText = "m cubed";
    }
    @FXML
    private void handleinFtMIAction(ActionEvent event){
        fromUnits.setText("ft cubed");
        fromText = "ft cubed";
    }
    @FXML
    private void handlelMIAction(ActionEvent event){
        toUnits.setText("L");
        toText = "L";
    }
    @FXML
    private void handlecmMIAction(ActionEvent event){
        toUnits.setText("cm cubed");
        toText = "cm cubed";
    }
    @FXML
    private void handlemLMIAction(ActionEvent event){
        toUnits.setText("mL");
        toText = "mL";
    }
    @FXML
    private void handleftMIAction(ActionEvent event){
        toUnits.setText("ft cubed");
        toText = "ft cubed";
    }
    @FXML
    private void handleimGalMIAction(ActionEvent event){
        toUnits.setText("imperial gal");
        toText = "imperial gal";
    }
    @FXML
    private void handlegalMIAction(ActionEvent event){
        toUnits.setText("gal");
        toText = "gal";
    }
    @FXML
    private void handleqtMIAction(ActionEvent event){
        toUnits.setText("qt");
        toText = "qt";
    }
    @FXML
    private void handleinMIAction(ActionEvent event){
        toUnits.setText("in cubed");
        toText = "in cubed";
    }
    @FXML
    private void handlemMIAction(ActionEvent event){
        toUnits.setText("m cubed");
        toText = "m cubed";
    }
    
    //MENU ITEM NUMBERS
    
    @FXML
    private void handleMenuButtonAction(ActionEvent event){
        Switchable.switchTo("Menu");
    }
    @FXML
    private void handleConvertButtonAction(ActionEvent event){
        if(!toText.equals("") && !fromText.equals("")){
            outputLabel.setText(Double.toString(volumeConverter.convert(fromText, toText)));
        }
        else{
            System.out.println("Convert Button didn't work");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

