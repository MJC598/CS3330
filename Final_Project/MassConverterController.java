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
 * FXML Controller class
 *
 * @author mcarroll
 */
public class MassConverterController extends Switchable implements Initializable {

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
    private MenuItem inKgMI;
    @FXML
    private MenuItem inLbMI;
    @FXML
    private MenuItem gMI;
    @FXML
    private MenuItem mTonMI;
    @FXML
    private MenuItem lbMI;
    @FXML
    private MenuItem ozMI;
    @FXML
    private MenuItem tonMI;
    @FXML
    private MenuItem kgMI;
    
    private String fromText = "";
    private String toText = "";
    MassConverter massConverter = new MassConverter();
    
    //NUMBERS
    
    
    @FXML
    private void handleNineButtonAction(ActionEvent event) {
        if(massConverter.getHolderValue() == 0.0){
            massConverter.setHolderValueAsString("9");
        }
        else{
            massConverter.setHolderValueAsString(massConverter.getHolderValueAsString() + "9");
        }
        inputLabel.setText(massConverter.getHolderValueAsString());
    }
    @FXML
    private void handleEightButtonAction(ActionEvent event) {
        if(massConverter.getHolderValue() == 0.0){
            massConverter.setHolderValueAsString("8");
        }
        else{
            massConverter.setHolderValueAsString(massConverter.getHolderValueAsString() + "8");
        }
        inputLabel.setText(massConverter.getHolderValueAsString());
    }
    @FXML
    private void handleSevenButtonAction(ActionEvent event) {
        if(massConverter.getHolderValue() == 0.0){
            massConverter.setHolderValueAsString("7");
        }
        else{
            massConverter.setHolderValueAsString(massConverter.getHolderValueAsString() + "7");
        }
        inputLabel.setText(massConverter.getHolderValueAsString());
    }
    @FXML
    private void handleSixButtonAction(ActionEvent event) {
        if(massConverter.getHolderValue() == 0.0){
            massConverter.setHolderValueAsString("6");
        }
        else{
            massConverter.setHolderValueAsString(massConverter.getHolderValueAsString() + "6");
        }
        inputLabel.setText(massConverter.getHolderValueAsString());
    }
    @FXML
    private void handleFiveButtonAction(ActionEvent event) {
        if(massConverter.getHolderValue() == 0.0){
            massConverter.setHolderValueAsString("5");
        }
        else{
            massConverter.setHolderValueAsString(massConverter.getHolderValueAsString() + "5");
        }
        inputLabel.setText(massConverter.getHolderValueAsString());
    }
    @FXML
    private void handleFourButtonAction(ActionEvent event) {
        if(massConverter.getHolderValue() == 0.0){
            massConverter.setHolderValueAsString("4");
        }
        else{
            massConverter.setHolderValueAsString(massConverter.getHolderValueAsString() + "4");
        }
        inputLabel.setText(massConverter.getHolderValueAsString());
    }
    @FXML
    private void handleThreeButtonAction(ActionEvent event) {
        if(massConverter.getHolderValue() == 0.0){
            massConverter.setHolderValueAsString("3");
        }
        else{
            massConverter.setHolderValueAsString(massConverter.getHolderValueAsString() + "3");
        }
        inputLabel.setText(massConverter.getHolderValueAsString());
    }
    @FXML
    private void handleTwoButtonAction(ActionEvent event) {
        if(massConverter.getHolderValue() == 0.0){
            massConverter.setHolderValueAsString("2");
        }
        else{
            massConverter.setHolderValueAsString(massConverter.getHolderValueAsString() + "2");
        }
        inputLabel.setText(massConverter.getHolderValueAsString());
    }
    @FXML
    private void handleOneButtonAction(ActionEvent event) {
        if(massConverter.getHolderValue() == 0.0){
            massConverter.setHolderValueAsString("1");
        }
        else{
            massConverter.setHolderValueAsString(massConverter.getHolderValueAsString() + "1");
        }
        inputLabel.setText(massConverter.getHolderValueAsString());
    }
    @FXML
    private void handleZeroButtonAction(ActionEvent event) {
        if(massConverter.getHolderValue() == 0.0){
            massConverter.setHolderValueAsString("0");
        }
        else{
            massConverter.setHolderValueAsString(massConverter.getHolderValueAsString() + "0");
        }
        inputLabel.setText(massConverter.getHolderValueAsString());
    }
    
    
    //NUMBERS
    
    @FXML
    private void handleClearButtonAction(ActionEvent event) {
        massConverter.sethValue("0.0");
        massConverter.setInputNumber(0.0);
        massConverter.setOutputNumber(0.0);
        massConverter.setHolderValue(0.0);
        massConverter.setDecimalCheck(false);
        inputLabel.setText("");
        outputLabel.setText("");
    }
    
    @FXML
    private void handleDecimalButtonAction(ActionEvent event) {
        if(massConverter.getHolderValue() == 0.0 && massConverter.isDecimalCheck() == false){
            massConverter.setHolderValueAsString("0.");
        }
        else{
            if(massConverter.isDecimalCheck() == false){
                massConverter.setHolderValueAsString(massConverter.getHolderValueAsString() + ".");
                massConverter.setDecimalCheck(true);
            }
        }
        inputLabel.setText(massConverter.getHolderValueAsString());
    }
    
    //MENU ITEM FUNCTIONS
    
    @FXML
    private void handleinKgMIAction(ActionEvent event){
        fromUnits.setText("kg");
        fromText = "kg";
    }
    @FXML
    private void handleinLbMIAction(ActionEvent event){
        fromUnits.setText("lb");
        fromText = "lb";
    }
    @FXML
    private void handlegMIAction(ActionEvent event){
        toUnits.setText("g");
        toText = "g";
    }
    @FXML
    private void handlemTonMIAction(ActionEvent event){
        toUnits.setText("metric ton");
        toText = "metric ton";
    }
    @FXML
    private void handlelbMIAction(ActionEvent event){
        toUnits.setText("lb");
        toText = "lb";
    }
    @FXML
    private void handleozMIAction(ActionEvent event){
        toUnits.setText("oz");
        toText = "oz";
    }
    @FXML
    private void handletonMIAction(ActionEvent event){
        toUnits.setText("ton");
        toText = "ton";
    }
    @FXML
    private void handlekgMIAction(ActionEvent event){
        toUnits.setText("kg");
        toText = "kg";
    }
    
    //MENU ITEM FUNCTIONS
    
    @FXML
    private void handleMenuButtonAction(ActionEvent event){
        Switchable.switchTo("Menu");
    }
    @FXML
    private void handleConvertButtonAction(ActionEvent event){
        if(!toText.equals("") && !fromText.equals("")){
            outputLabel.setText(Double.toString(massConverter.convert(fromText, toText)));
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
