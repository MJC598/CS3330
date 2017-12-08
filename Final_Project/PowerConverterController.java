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
public class PowerConverterController extends Switchable implements Initializable{
    
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
    private MenuItem inWMI;
    @FXML
    private MenuItem jperSMI;
    @FXML
    private MenuItem nMPerSMI;
    @FXML
    private MenuItem calPerSMI;
    @FXML
    private MenuItem ftLbPerSMI;
    @FXML
    private MenuItem btuPerSMI;
    @FXML
    private MenuItem hpMI;
    
    private String fromText = "";
    private String toText = "";
    PowerConverter powerConverter = new PowerConverter();
    
    //NUMBERS
    
    
    @FXML
    private void handleNineButtonAction(ActionEvent event) {
        if(powerConverter.getHolderValue() == 0.0){
            powerConverter.setHolderValueAsString("9");
        }
        else{
            powerConverter.setHolderValueAsString(powerConverter.getHolderValueAsString() + "9");
        }
        inputLabel.setText(powerConverter.getHolderValueAsString());
    }
    @FXML
    private void handleEightButtonAction(ActionEvent event) {
        if(powerConverter.getHolderValue() == 0.0){
            powerConverter.setHolderValueAsString("8");
        }
        else{
            powerConverter.setHolderValueAsString(powerConverter.getHolderValueAsString() + "8");
        }
        inputLabel.setText(powerConverter.getHolderValueAsString());
    }
    @FXML
    private void handleSevenButtonAction(ActionEvent event) {
        if(powerConverter.getHolderValue() == 0.0){
            powerConverter.setHolderValueAsString("7");
        }
        else{
            powerConverter.setHolderValueAsString(powerConverter.getHolderValueAsString() + "7");
        }
        inputLabel.setText(powerConverter.getHolderValueAsString());
    }
    @FXML
    private void handleSixButtonAction(ActionEvent event) {
        if(powerConverter.getHolderValue() == 0.0){
            powerConverter.setHolderValueAsString("6");
        }
        else{
            powerConverter.setHolderValueAsString(powerConverter.getHolderValueAsString() + "6");
        }
        inputLabel.setText(powerConverter.getHolderValueAsString());
    }
    @FXML
    private void handleFiveButtonAction(ActionEvent event) {
        if(powerConverter.getHolderValue() == 0.0){
            powerConverter.setHolderValueAsString("5");
        }
        else{
            powerConverter.setHolderValueAsString(powerConverter.getHolderValueAsString() + "5");
        }
        inputLabel.setText(powerConverter.getHolderValueAsString());
    }
    @FXML
    private void handleFourButtonAction(ActionEvent event) {
        if(powerConverter.getHolderValue() == 0.0){
            powerConverter.setHolderValueAsString("4");
        }
        else{
            powerConverter.setHolderValueAsString(powerConverter.getHolderValueAsString() + "4");
        }
        inputLabel.setText(powerConverter.getHolderValueAsString());
    }
    @FXML
    private void handleThreeButtonAction(ActionEvent event) {
        if(powerConverter.getHolderValue() == 0.0){
            powerConverter.setHolderValueAsString("3");
        }
        else{
            powerConverter.setHolderValueAsString(powerConverter.getHolderValueAsString() + "3");
        }
        inputLabel.setText(powerConverter.getHolderValueAsString());
    }
    @FXML
    private void handleTwoButtonAction(ActionEvent event) {
        if(powerConverter.getHolderValue() == 0.0){
            powerConverter.setHolderValueAsString("2");
        }
        else{
            powerConverter.setHolderValueAsString(powerConverter.getHolderValueAsString() + "2");
        }
        inputLabel.setText(powerConverter.getHolderValueAsString());
    }
    @FXML
    private void handleOneButtonAction(ActionEvent event) {
        if(powerConverter.getHolderValue() == 0.0){
            powerConverter.setHolderValueAsString("1");
        }
        else{
            powerConverter.setHolderValueAsString(powerConverter.getHolderValueAsString() + "1");
        }
        inputLabel.setText(powerConverter.getHolderValueAsString());
    }
    @FXML
    private void handleZeroButtonAction(ActionEvent event) {
        if(powerConverter.getHolderValue() == 0.0){
            powerConverter.setHolderValueAsString("0");
        }
        else{
            powerConverter.setHolderValueAsString(powerConverter.getHolderValueAsString() + "0");
        }
        inputLabel.setText(powerConverter.getHolderValueAsString());
    }
    
    
    //NUMBERS
    
    @FXML
    private void handleClearButtonAction(ActionEvent event) {
        powerConverter.sethValue("0.0");
        powerConverter.setInputNumber(0.0);
        powerConverter.setOutputNumber(0.0);
        powerConverter.setHolderValue(0.0);
        powerConverter.setDecimalCheck(false);
        inputLabel.setText("");
        outputLabel.setText("");
    }
    
    @FXML
    private void handleDecimalButtonAction(ActionEvent event) {
        if(powerConverter.getHolderValue() == 0.0 && powerConverter.isDecimalCheck() == false){
            powerConverter.setHolderValueAsString("0.");
        }
        else{
            if(powerConverter.isDecimalCheck() == false){
                powerConverter.setHolderValueAsString(powerConverter.getHolderValueAsString() + ".");
                powerConverter.setDecimalCheck(true);
            }
        }
        inputLabel.setText(powerConverter.getHolderValueAsString());
    }
    
    //MENU ITEM FUNCTIONS
    
    @FXML
    private void handleinWMIAction(ActionEvent event){
        fromUnits.setText("W");
        fromText = "W";
    }
    @FXML
    private void handlejperSMIAction(ActionEvent event){
        toUnits.setText("J/s");
        toText = "J/s";
    }
    @FXML
    private void handlenMPerSMIAction(ActionEvent event){
        toUnits.setText("N m/s");
        toText = "N m/s";
    }
    @FXML
    private void handlecalPerSMIAction(ActionEvent event){
        toUnits.setText("cal/s");
        toText = "cal/s";
    }
    @FXML
    private void handleftLbPerSMIAction(ActionEvent event){
        toUnits.setText("ft lb(force)/s");
        toText = "ft lb(force)/s";
    }
    @FXML
    private void handlebtuPerSMIAction(ActionEvent event){
        toUnits.setText("Btu/s");
        toText = "Btu/s";
    }
    @FXML
    private void handlehpMIAction(ActionEvent event){
        toUnits.setText("hp");
        toText = "hp";
    }
    
    //MENU ITEM FUNCTIONS
    
    @FXML
    private void handleMenuButtonAction(ActionEvent event){
        Switchable.switchTo("Menu");
    }
    @FXML
    private void handleConvertButtonAction(ActionEvent event){
        if(!toText.equals("") && !fromText.equals("")){
            outputLabel.setText(Double.toString(powerConverter.convert(fromText, toText)));
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