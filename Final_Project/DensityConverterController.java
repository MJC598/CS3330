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
public class DensityConverterController extends Switchable implements Initializable{
    
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
    private MenuItem inMI;
    @FXML
    private MenuItem kgPerMMI;
    @FXML
    private MenuItem lbFtCubedMI;
    
    private String fromText = "";
    private String toText = "";
    DensityConverter densityConverter = new DensityConverter();
    
    //NUMBERS
    
    
    @FXML
    private void handleNineButtonAction(ActionEvent event) {
        if(densityConverter.getHolderValue() == 0.0){
            densityConverter.setHolderValueAsString("9");
        }
        else{
            densityConverter.setHolderValueAsString(densityConverter.getHolderValueAsString() + "9");
        }
        inputLabel.setText(densityConverter.getHolderValueAsString());
    }
    @FXML
    private void handleEightButtonAction(ActionEvent event) {
        if(densityConverter.getHolderValue() == 0.0){
            densityConverter.setHolderValueAsString("8");
        }
        else{
            densityConverter.setHolderValueAsString(densityConverter.getHolderValueAsString() + "8");
        }
        inputLabel.setText(densityConverter.getHolderValueAsString());
    }
    @FXML
    private void handleSevenButtonAction(ActionEvent event) {
        if(densityConverter.getHolderValue() == 0.0){
            densityConverter.setHolderValueAsString("7");
        }
        else{
            densityConverter.setHolderValueAsString(densityConverter.getHolderValueAsString() + "7");
        }
        inputLabel.setText(densityConverter.getHolderValueAsString());
    }
    @FXML
    private void handleSixButtonAction(ActionEvent event) {
        if(densityConverter.getHolderValue() == 0.0){
            densityConverter.setHolderValueAsString("6");
        }
        else{
            densityConverter.setHolderValueAsString(densityConverter.getHolderValueAsString() + "6");
        }
        inputLabel.setText(densityConverter.getHolderValueAsString());
    }
    @FXML
    private void handleFiveButtonAction(ActionEvent event) {
        if(densityConverter.getHolderValue() == 0.0){
            densityConverter.setHolderValueAsString("5");
        }
        else{
            densityConverter.setHolderValueAsString(densityConverter.getHolderValueAsString() + "5");
        }
        inputLabel.setText(densityConverter.getHolderValueAsString());
    }
    @FXML
    private void handleFourButtonAction(ActionEvent event) {
        if(densityConverter.getHolderValue() == 0.0){
            densityConverter.setHolderValueAsString("4");
        }
        else{
            densityConverter.setHolderValueAsString(densityConverter.getHolderValueAsString() + "4");
        }
        inputLabel.setText(densityConverter.getHolderValueAsString());
    }
    @FXML
    private void handleThreeButtonAction(ActionEvent event) {
        if(densityConverter.getHolderValue() == 0.0){
            densityConverter.setHolderValueAsString("3");
        }
        else{
            densityConverter.setHolderValueAsString(densityConverter.getHolderValueAsString() + "3");
        }
        inputLabel.setText(densityConverter.getHolderValueAsString());
    }
    @FXML
    private void handleTwoButtonAction(ActionEvent event) {
        if(densityConverter.getHolderValue() == 0.0){
            densityConverter.setHolderValueAsString("2");
        }
        else{
            densityConverter.setHolderValueAsString(densityConverter.getHolderValueAsString() + "2");
        }
        inputLabel.setText(densityConverter.getHolderValueAsString());
    }
    @FXML
    private void handleOneButtonAction(ActionEvent event) {
        if(densityConverter.getHolderValue() == 0.0){
            densityConverter.setHolderValueAsString("1");
        }
        else{
            densityConverter.setHolderValueAsString(densityConverter.getHolderValueAsString() + "1");
        }
        inputLabel.setText(densityConverter.getHolderValueAsString());
    }
    @FXML
    private void handleZeroButtonAction(ActionEvent event) {
        if(densityConverter.getHolderValue() == 0.0){
            densityConverter.setHolderValueAsString("0");
        }
        else{
            densityConverter.setHolderValueAsString(densityConverter.getHolderValueAsString() + "0");
        }
        inputLabel.setText(densityConverter.getHolderValueAsString());
    }
    
    
    //NUMBERS
    
    @FXML
    private void handleClearButtonAction(ActionEvent event) {
        densityConverter.sethValue("0.0");
        densityConverter.setInputNumber(0.0);
        densityConverter.setOutputNumber(0.0);
        densityConverter.setHolderValue(0.0);
        densityConverter.setDecimalCheck(false);
        inputLabel.setText("");
        outputLabel.setText("");
    }
    
    @FXML
    private void handleDecimalButtonAction(ActionEvent event) {
        if(densityConverter.getHolderValue() == 0.0 && densityConverter.isDecimalCheck() == false){
            densityConverter.setHolderValueAsString("0.");
        }
        else{
            if(densityConverter.isDecimalCheck() == false){
                densityConverter.setHolderValueAsString(densityConverter.getHolderValueAsString() + ".");
                densityConverter.setDecimalCheck(true);
            }
        }
        inputLabel.setText(densityConverter.getHolderValueAsString());
    }
    
    @FXML
    private void handleMenuButtonAction(ActionEvent event){
        Switchable.switchTo("Menu");
    }
    
    @FXML
    private void handleConvertButtonAction(ActionEvent event){
        if(!toText.equals("") && !fromText.equals("")){
            outputLabel.setText(Double.toString(densityConverter.convert(fromText, toText)));
        }
    }

    //MENU ITEM FUNCTIONS
    
    @FXML
    private void handleinMIAction(ActionEvent event){
        fromUnits.setText("g/cm cubed");
        fromText = "g/cm cubed";
    }
    @FXML
    private void handlekgPerMMIAction(ActionEvent event){
        toUnits.setText("kg/m cubed");
        toText = "kg/m cubed";
    }
    @FXML
    private void handlelbFtCubedMIMIAction(ActionEvent event){
        toUnits.setText("lb(mass)/ft cubed");
        toText = "lb(mass)/ft cubed";
    }
    
    //MENU ITEM FUNCTIONS
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}