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
public class PressureConverterController extends Switchable implements Initializable{
    
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
    private MenuItem inAtmMI;
    @FXML
    private MenuItem paMI;
    @FXML
    private MenuItem kPaMI;
    @FXML
    private MenuItem barMI;
    @FXML
    private MenuItem dynesMI;
    @FXML
    private MenuItem psiMI;
    @FXML
    private MenuItem torrMI;
    
    private String fromText = "";
    private String toText = "";
    PressureConverter pressureConverter = new PressureConverter();
    
    //NUMBERS
    
    
    @FXML
    private void handleNineButtonAction(ActionEvent event) {
        if(pressureConverter.getHolderValue() == 0.0){
            pressureConverter.setHolderValueAsString("9");
        }
        else{
            pressureConverter.setHolderValueAsString(pressureConverter.getHolderValueAsString() + "9");
        }
        inputLabel.setText(pressureConverter.getHolderValueAsString());
    }
    @FXML
    private void handleEightButtonAction(ActionEvent event) {
        if(pressureConverter.getHolderValue() == 0.0){
            pressureConverter.setHolderValueAsString("8");
        }
        else{
            pressureConverter.setHolderValueAsString(pressureConverter.getHolderValueAsString() + "8");
        }
        inputLabel.setText(pressureConverter.getHolderValueAsString());
    }
    @FXML
    private void handleSevenButtonAction(ActionEvent event) {
        if(pressureConverter.getHolderValue() == 0.0){
            pressureConverter.setHolderValueAsString("7");
        }
        else{
            pressureConverter.setHolderValueAsString(pressureConverter.getHolderValueAsString() + "7");
        }
        inputLabel.setText(pressureConverter.getHolderValueAsString());
    }
    @FXML
    private void handleSixButtonAction(ActionEvent event) {
        if(pressureConverter.getHolderValue() == 0.0){
            pressureConverter.setHolderValueAsString("6");
        }
        else{
            pressureConverter.setHolderValueAsString(pressureConverter.getHolderValueAsString() + "6");
        }
        inputLabel.setText(pressureConverter.getHolderValueAsString());
    }
    @FXML
    private void handleFiveButtonAction(ActionEvent event) {
        if(pressureConverter.getHolderValue() == 0.0){
            pressureConverter.setHolderValueAsString("5");
        }
        else{
            pressureConverter.setHolderValueAsString(pressureConverter.getHolderValueAsString() + "5");
        }
        inputLabel.setText(pressureConverter.getHolderValueAsString());
    }
    @FXML
    private void handleFourButtonAction(ActionEvent event) {
        if(pressureConverter.getHolderValue() == 0.0){
            pressureConverter.setHolderValueAsString("4");
        }
        else{
            pressureConverter.setHolderValueAsString(pressureConverter.getHolderValueAsString() + "4");
        }
        inputLabel.setText(pressureConverter.getHolderValueAsString());
    }
    @FXML
    private void handleThreeButtonAction(ActionEvent event) {
        if(pressureConverter.getHolderValue() == 0.0){
            pressureConverter.setHolderValueAsString("3");
        }
        else{
            pressureConverter.setHolderValueAsString(pressureConverter.getHolderValueAsString() + "3");
        }
        inputLabel.setText(pressureConverter.getHolderValueAsString());
    }
    @FXML
    private void handleTwoButtonAction(ActionEvent event) {
        if(pressureConverter.getHolderValue() == 0.0){
            pressureConverter.setHolderValueAsString("2");
        }
        else{
            pressureConverter.setHolderValueAsString(pressureConverter.getHolderValueAsString() + "2");
        }
        inputLabel.setText(pressureConverter.getHolderValueAsString());
    }
    @FXML
    private void handleOneButtonAction(ActionEvent event) {
        if(pressureConverter.getHolderValue() == 0.0){
            pressureConverter.setHolderValueAsString("1");
        }
        else{
            pressureConverter.setHolderValueAsString(pressureConverter.getHolderValueAsString() + "1");
        }
        inputLabel.setText(pressureConverter.getHolderValueAsString());
    }
    @FXML
    private void handleZeroButtonAction(ActionEvent event) {
        if(pressureConverter.getHolderValue() == 0.0){
            pressureConverter.setHolderValueAsString("0");
        }
        else{
            pressureConverter.setHolderValueAsString(pressureConverter.getHolderValueAsString() + "0");
        }
        inputLabel.setText(pressureConverter.getHolderValueAsString());
    }
    
    
    //NUMBERS
    
    @FXML
    private void handleClearButtonAction(ActionEvent event) {
        pressureConverter.sethValue("0.0");
        pressureConverter.setInputNumber(0.0);
        pressureConverter.setOutputNumber(0.0);
        pressureConverter.setHolderValue(0.0);
        pressureConverter.setDecimalCheck(false);
        inputLabel.setText("");
        outputLabel.setText("");
    }
    
    @FXML
    private void handleDecimalButtonAction(ActionEvent event) {
        if(pressureConverter.getHolderValue() == 0.0 && pressureConverter.isDecimalCheck() == false){
            pressureConverter.setHolderValueAsString("0.");
        }
        else{
            if(pressureConverter.isDecimalCheck() == false){
                pressureConverter.setHolderValueAsString(pressureConverter.getHolderValueAsString() + ".");
                pressureConverter.setDecimalCheck(true);
            }
        }
        inputLabel.setText(pressureConverter.getHolderValueAsString());
    }
    
    //MENU ITEM FUNCTIONS
    
    @FXML
    private void handleinAtmMIAction(ActionEvent event){
        fromUnits.setText("atm");
        fromText = "atm";
    }
    @FXML
    private void handlepaMIAction(ActionEvent event){
        toUnits.setText("Pa");
        toText = "Pa";
    }
    @FXML
    private void handlekPaMIAction(ActionEvent event){
        toUnits.setText("kPa");
        toText = "kPa";
    }
    @FXML
    private void handlebarMIAction(ActionEvent event){
        toUnits.setText("bar");
        toText = "bar";
    }
    @FXML
    private void handledynesMIAction(ActionEvent event){
        toUnits.setText("dynes/cm squared");
        toText = "dynes/cm squared";
    }
    @FXML
    private void handlepsiMIAction(ActionEvent event){
        toUnits.setText("PSI");
        toText = "PSI";
    }
    @FXML
    private void handletorrMIAction(ActionEvent event){
        toUnits.setText("torr");
        toText = "torr";
    }
    
    //MENU ITEM FUNCTIONS
    
    @FXML
    private void handleMenuButtonAction(ActionEvent event){
        Switchable.switchTo("Menu");
    }
    @FXML
    private void handleConvertButtonAction(ActionEvent event){
        if(!toText.equals("") && !fromText.equals("")){
            outputLabel.setText(Double.toString(pressureConverter.convert(fromText, toText)));
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