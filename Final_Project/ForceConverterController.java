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
public class ForceConverterController extends Switchable implements Initializable{
    
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
    private MenuItem inNMI;
    @FXML
    private MenuItem inLbMI;
    @FXML
    private MenuItem kgMMI;
    @FXML
    private MenuItem dynesMI;
    @FXML
    private MenuItem gCmMI;
    @FXML
    private MenuItem lbMI;
    @FXML
    private MenuItem lbFtMI;
    @FXML
    private MenuItem nMI;
    
    private String fromText = "";
    private String toText = "";
    ForceConverter forceConverter = new ForceConverter();
    
    //NUMBERS
    
    
    @FXML
    private void handleNineButtonAction(ActionEvent event) {
        if(forceConverter.getHolderValue() == 0.0){
            forceConverter.setHolderValueAsString("9");
        }
        else{
            forceConverter.setHolderValueAsString(forceConverter.getHolderValueAsString() + "9");
        }
        inputLabel.setText(forceConverter.getHolderValueAsString());
    }
    @FXML
    private void handleEightButtonAction(ActionEvent event) {
        if(forceConverter.getHolderValue() == 0.0){
            forceConverter.setHolderValueAsString("8");
        }
        else{
            forceConverter.setHolderValueAsString(forceConverter.getHolderValueAsString() + "8");
        }
        inputLabel.setText(forceConverter.getHolderValueAsString());
    }
    @FXML
    private void handleSevenButtonAction(ActionEvent event) {
        if(forceConverter.getHolderValue() == 0.0){
            forceConverter.setHolderValueAsString("7");
        }
        else{
            forceConverter.setHolderValueAsString(forceConverter.getHolderValueAsString() + "7");
        }
        inputLabel.setText(forceConverter.getHolderValueAsString());
    }
    @FXML
    private void handleSixButtonAction(ActionEvent event) {
        if(forceConverter.getHolderValue() == 0.0){
            forceConverter.setHolderValueAsString("6");
        }
        else{
            forceConverter.setHolderValueAsString(forceConverter.getHolderValueAsString() + "6");
        }
        inputLabel.setText(forceConverter.getHolderValueAsString());
    }
    @FXML
    private void handleFiveButtonAction(ActionEvent event) {
        if(forceConverter.getHolderValue() == 0.0){
            forceConverter.setHolderValueAsString("5");
        }
        else{
            forceConverter.setHolderValueAsString(forceConverter.getHolderValueAsString() + "5");
        }
        inputLabel.setText(forceConverter.getHolderValueAsString());
    }
    @FXML
    private void handleFourButtonAction(ActionEvent event) {
        if(forceConverter.getHolderValue() == 0.0){
            forceConverter.setHolderValueAsString("4");
        }
        else{
            forceConverter.setHolderValueAsString(forceConverter.getHolderValueAsString() + "4");
        }
        inputLabel.setText(forceConverter.getHolderValueAsString());
    }
    @FXML
    private void handleThreeButtonAction(ActionEvent event) {
        if(forceConverter.getHolderValue() == 0.0){
            forceConverter.setHolderValueAsString("3");
        }
        else{
            forceConverter.setHolderValueAsString(forceConverter.getHolderValueAsString() + "3");
        }
        inputLabel.setText(forceConverter.getHolderValueAsString());
    }
    @FXML
    private void handleTwoButtonAction(ActionEvent event) {
        if(forceConverter.getHolderValue() == 0.0){
            forceConverter.setHolderValueAsString("2");
        }
        else{
            forceConverter.setHolderValueAsString(forceConverter.getHolderValueAsString() + "2");
        }
        inputLabel.setText(forceConverter.getHolderValueAsString());
    }
    @FXML
    private void handleOneButtonAction(ActionEvent event) {
        if(forceConverter.getHolderValue() == 0.0){
            forceConverter.setHolderValueAsString("1");
        }
        else{
            forceConverter.setHolderValueAsString(forceConverter.getHolderValueAsString() + "1");
        }
        inputLabel.setText(forceConverter.getHolderValueAsString());
    }
    @FXML
    private void handleZeroButtonAction(ActionEvent event) {
        if(forceConverter.getHolderValue() == 0.0){
            forceConverter.setHolderValueAsString("0");
        }
        else{
            forceConverter.setHolderValueAsString(forceConverter.getHolderValueAsString() + "0");
        }
        inputLabel.setText(forceConverter.getHolderValueAsString());
    }
    
    
    //NUMBERS
    
    @FXML
    private void handleClearButtonAction(ActionEvent event) {
        forceConverter.sethValue("0.0");
        forceConverter.setInputNumber(0.0);
        forceConverter.setOutputNumber(0.0);
        forceConverter.setHolderValue(0.0);
        forceConverter.setDecimalCheck(false);
        inputLabel.setText("");
        outputLabel.setText("");
    }
    
    @FXML
    private void handleDecimalButtonAction(ActionEvent event) {
        if(forceConverter.getHolderValue() == 0.0 && forceConverter.isDecimalCheck() == false){
            forceConverter.setHolderValueAsString("0.");
        }
        else{
            if(forceConverter.isDecimalCheck() == false){
                forceConverter.setHolderValueAsString(forceConverter.getHolderValueAsString() + ".");
                forceConverter.setDecimalCheck(true);
            }
        }
        inputLabel.setText(forceConverter.getHolderValueAsString());
    }
    
    //MENU ITEM FUNCTIONS
    
    @FXML
    private void handleinNMIAction(ActionEvent event){
        fromUnits.setText("N");
        fromText = "N";
    }
    @FXML
    private void handleinLbMIAction(ActionEvent event){
        fromUnits.setText("lb(force)");
        fromText = "lb(force)";
    }
    @FXML
    private void handlekgMMIAction(ActionEvent event){
        toUnits.setText("kg m/s squared");
        toText = "kg m/s squared";
    }
    @FXML
    private void handledynesMIAction(ActionEvent event){
        toUnits.setText("dynes");
        toText = "dynes";
    }
    @FXML
    private void handlegCmMIAction(ActionEvent event){
        toUnits.setText("g cm/s squared");
        toText = "g cm/s squared";
    }
    @FXML
    private void handlelbMIAction(ActionEvent event){
        toUnits.setText("lb(force)");
        toText = "lb(force)";
    }
    @FXML
    private void handlelbFtMIAction(ActionEvent event){
        toUnits.setText("lb(mass) ft/s squared");
        toText = "lb(mass) ft/s squared";
    }
    @FXML
    private void handlenMIAction(ActionEvent event){
        toUnits.setText("N");
        toText = "N";
    }
    
    //MENU ITEM FUNCTIONS
    
    @FXML
    private void handleMenuButtonAction(ActionEvent event){
        Switchable.switchTo("Menu");
    }
    
    @FXML
    private void handleConvertButtonAction(ActionEvent event){
        if(!toText.equals("") && !fromText.equals("")){
            outputLabel.setText(Double.toString(forceConverter.convert(fromText, toText)));
        }
        else{
            System.out.println("convert didn't convert anything");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}