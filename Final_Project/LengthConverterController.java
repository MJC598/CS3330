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
public class LengthConverterController extends Switchable implements Initializable{
    
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
    private MenuItem cmMI;
    @FXML
    private MenuItem mmMI;
    @FXML
    private MenuItem microns;
    @FXML
    private MenuItem angstromsMI;
    @FXML
    private MenuItem inMI;
    @FXML
    private MenuItem ftMI;
    @FXML
    private MenuItem ydMI;
    @FXML
    private MenuItem mMI;
    @FXML
    private MenuItem mileMI;
    
    private String fromText = "";
    private String toText = "";
    LengthConverter LengthConverter = new LengthConverter();
    
    //NUMBERS
    
    
    @FXML
    private void handleNineButtonAction(ActionEvent event) {
        if(LengthConverter.getHolderValue() == 0.0){
            LengthConverter.setHolderValueAsString("9");
        }
        else{
            LengthConverter.setHolderValueAsString(LengthConverter.getHolderValueAsString() + "9");
        }
        inputLabel.setText(LengthConverter.getHolderValueAsString());
    }
    @FXML
    private void handleEightButtonAction(ActionEvent event) {
        if(LengthConverter.getHolderValue() == 0.0){
            LengthConverter.setHolderValueAsString("8");
        }
        else{
            LengthConverter.setHolderValueAsString(LengthConverter.getHolderValueAsString() + "8");
        }
        inputLabel.setText(LengthConverter.getHolderValueAsString());
    }
    @FXML
    private void handleSevenButtonAction(ActionEvent event) {
        if(LengthConverter.getHolderValue() == 0.0){
            LengthConverter.setHolderValueAsString("7");
        }
        else{
            LengthConverter.setHolderValueAsString(LengthConverter.getHolderValueAsString() + "7");
        }
        inputLabel.setText(LengthConverter.getHolderValueAsString());
    }
    @FXML
    private void handleSixButtonAction(ActionEvent event) {
        if(LengthConverter.getHolderValue() == 0.0){
            LengthConverter.setHolderValueAsString("6");
        }
        else{
            LengthConverter.setHolderValueAsString(LengthConverter.getHolderValueAsString() + "6");
        }
        inputLabel.setText(LengthConverter.getHolderValueAsString());
    }
    @FXML
    private void handleFiveButtonAction(ActionEvent event) {
        if(LengthConverter.getHolderValue() == 0.0){
            LengthConverter.setHolderValueAsString("5");
        }
        else{
            LengthConverter.setHolderValueAsString(LengthConverter.getHolderValueAsString() + "5");
        }
        inputLabel.setText(LengthConverter.getHolderValueAsString());
    }
    @FXML
    private void handleFourButtonAction(ActionEvent event) {
        if(LengthConverter.getHolderValue() == 0.0){
            LengthConverter.setHolderValueAsString("4");
        }
        else{
            LengthConverter.setHolderValueAsString(LengthConverter.getHolderValueAsString() + "4");
        }
        inputLabel.setText(LengthConverter.getHolderValueAsString());
    }
    @FXML
    private void handleThreeButtonAction(ActionEvent event) {
        if(LengthConverter.getHolderValue() == 0.0){
            LengthConverter.setHolderValueAsString("3");
        }
        else{
            LengthConverter.setHolderValueAsString(LengthConverter.getHolderValueAsString() + "3");
        }
        inputLabel.setText(LengthConverter.getHolderValueAsString());
    }
    @FXML
    private void handleTwoButtonAction(ActionEvent event) {
        if(LengthConverter.getHolderValue() == 0.0){
            LengthConverter.setHolderValueAsString("2");
        }
        else{
            LengthConverter.setHolderValueAsString(LengthConverter.getHolderValueAsString() + "2");
        }
        inputLabel.setText(LengthConverter.getHolderValueAsString());
    }
    @FXML
    private void handleOneButtonAction(ActionEvent event) {
        if(LengthConverter.getHolderValue() == 0.0){
            LengthConverter.setHolderValueAsString("1");
        }
        else{
            LengthConverter.setHolderValueAsString(LengthConverter.getHolderValueAsString() + "1");
        }
        inputLabel.setText(LengthConverter.getHolderValueAsString());
    }
    @FXML
    private void handleZeroButtonAction(ActionEvent event) {
        if(LengthConverter.getHolderValue() == 0.0){
            LengthConverter.setHolderValueAsString("0");
        }
        else{
            LengthConverter.setHolderValueAsString(LengthConverter.getHolderValueAsString() + "0");
        }
        inputLabel.setText(LengthConverter.getHolderValueAsString());
    }
    
    
    //NUMBERS
    
    @FXML
    private void handleClearButtonAction(ActionEvent event) {
        LengthConverter.sethValue("0.0");
        LengthConverter.setInputNumber(0.0);
        LengthConverter.setOutputNumber(0.0);
        LengthConverter.setHolderValue(0.0);
        LengthConverter.setDecimalCheck(false);
        inputLabel.setText("");
        outputLabel.setText("");
    }
    
    @FXML
    private void handleDecimalButtonAction(ActionEvent event) {
        if(LengthConverter.getHolderValue() == 0.0 && LengthConverter.isDecimalCheck() == false){
            LengthConverter.setHolderValueAsString("0.");
        }
        else{
            if(LengthConverter.isDecimalCheck() == false){
                LengthConverter.setHolderValueAsString(LengthConverter.getHolderValueAsString() + ".");
                LengthConverter.setDecimalCheck(true);
            }
        }
        inputLabel.setText(LengthConverter.getHolderValueAsString());
    }
    
    //MENU ITEM FUNCTIONS
    
    @FXML
    private void handleinMMIAction(ActionEvent event){
        fromUnits.setText("m");
        fromText = "m";
    }
    @FXML
    private void handleinFtMIAction(ActionEvent event){
        fromUnits.setText("ft");
        fromText = "ft";
    }
    @FXML
    private void handlecmMIAction(ActionEvent event){
        toUnits.setText("cm");
        toText = "cm";
    }
    @FXML
    private void handlemmMIAction(ActionEvent event){
        toUnits.setText("mm");
        toText = "mm";
    }
    @FXML
    private void handlemicronsMIAction(ActionEvent event){
        toUnits.setText("microns");
        toText = "microns";
    }
    @FXML
    private void handleangstromsMIAction(ActionEvent event){
        toUnits.setText("angstroms");
        toText = "angstroms";
    }
    @FXML
    private void handleinMIAction(ActionEvent event){
        toUnits.setText("in");
        toText = "in";
    }
    @FXML
    private void handleftMIAction(ActionEvent event){
        toUnits.setText("ft");
        toText = "ft";
    }
    @FXML
    private void handleydMIAction(ActionEvent event){
        toUnits.setText("yd");
        toText = "yd";
    }
    @FXML
    private void handlemMIAction(ActionEvent event){
        toUnits.setText("m");
        toText = "m";
    }
    @FXML
    private void handlmileMIAction(ActionEvent event){
        toUnits.setText("mile");
        toText = "mile";
    }
    
    //MENU ITEM FUNCTIONS
    
    @FXML
    private void handleMenuButtonAction(ActionEvent event){
        Switchable.switchTo("Menu");
    }
    @FXML
    private void handleConvertButtonAction(ActionEvent event){
        if(!toText.equals("") && !fromText.equals("")){
            outputLabel.setText(Double.toString(LengthConverter.convert(fromText, toText)));
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

