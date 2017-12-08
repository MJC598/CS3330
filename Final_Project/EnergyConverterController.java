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
public class EnergyConverterController extends Switchable implements Initializable{
    
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
    private MenuItem nmMI;
    @FXML
    private MenuItem ergsMI;
    @FXML
    private MenuItem dynesCmMI;
    @FXML
    private MenuItem kgMMI;
    @FXML
    private MenuItem kWhMI;
    @FXML
    private MenuItem calMI;
    @FXML
    private MenuItem kcalMI;
    @FXML
    private MenuItem ftLbMI;
    @FXML
    private MenuItem btuMI;
    
    private String fromText = "";
    private String toText = "";
    EnergyConverter energyConverter = new EnergyConverter();
    
    //NUMBERS
    
    
    @FXML
    private void handleNineButtonAction(ActionEvent event) {
        if(energyConverter.getHolderValue() == 0.0){
            energyConverter.setHolderValueAsString("9");
        }
        else{
            energyConverter.setHolderValueAsString(energyConverter.getHolderValueAsString() + "9");
        }
        inputLabel.setText(energyConverter.getHolderValueAsString());
    }
    @FXML
    private void handleEightButtonAction(ActionEvent event) {
        if(energyConverter.getHolderValue() == 0.0){
            energyConverter.setHolderValueAsString("8");
        }
        else{
            energyConverter.setHolderValueAsString(energyConverter.getHolderValueAsString() + "8");
        }
        inputLabel.setText(energyConverter.getHolderValueAsString());
    }
    @FXML
    private void handleSevenButtonAction(ActionEvent event) {
        if(energyConverter.getHolderValue() == 0.0){
            energyConverter.setHolderValueAsString("7");
        }
        else{
            energyConverter.setHolderValueAsString(energyConverter.getHolderValueAsString() + "7");
        }
        inputLabel.setText(energyConverter.getHolderValueAsString());
    }
    @FXML
    private void handleSixButtonAction(ActionEvent event) {
        if(energyConverter.getHolderValue() == 0.0){
            energyConverter.setHolderValueAsString("6");
        }
        else{
            energyConverter.setHolderValueAsString(energyConverter.getHolderValueAsString() + "6");
        }
        inputLabel.setText(energyConverter.getHolderValueAsString());
    }
    @FXML
    private void handleFiveButtonAction(ActionEvent event) {
        if(energyConverter.getHolderValue() == 0.0){
            energyConverter.setHolderValueAsString("5");
        }
        else{
            energyConverter.setHolderValueAsString(energyConverter.getHolderValueAsString() + "5");
        }
        inputLabel.setText(energyConverter.getHolderValueAsString());
    }
    @FXML
    private void handleFourButtonAction(ActionEvent event) {
        if(energyConverter.getHolderValue() == 0.0){
            energyConverter.setHolderValueAsString("4");
        }
        else{
            energyConverter.setHolderValueAsString(energyConverter.getHolderValueAsString() + "4");
        }
        inputLabel.setText(energyConverter.getHolderValueAsString());
    }
    @FXML
    private void handleThreeButtonAction(ActionEvent event) {
        if(energyConverter.getHolderValue() == 0.0){
            energyConverter.setHolderValueAsString("3");
        }
        else{
            energyConverter.setHolderValueAsString(energyConverter.getHolderValueAsString() + "3");
        }
        inputLabel.setText(energyConverter.getHolderValueAsString());
    }
    @FXML
    private void handleTwoButtonAction(ActionEvent event) {
        if(energyConverter.getHolderValue() == 0.0){
            energyConverter.setHolderValueAsString("2");
        }
        else{
            energyConverter.setHolderValueAsString(energyConverter.getHolderValueAsString() + "2");
        }
        inputLabel.setText(energyConverter.getHolderValueAsString());
    }
    @FXML
    private void handleOneButtonAction(ActionEvent event) {
        if(energyConverter.getHolderValue() == 0.0){
            energyConverter.setHolderValueAsString("1");
        }
        else{
            energyConverter.setHolderValueAsString(energyConverter.getHolderValueAsString() + "1");
        }
        inputLabel.setText(energyConverter.getHolderValueAsString());
    }
    @FXML
    private void handleZeroButtonAction(ActionEvent event) {
        if(energyConverter.getHolderValue() == 0.0){
            energyConverter.setHolderValueAsString("0");
        }
        else{
            energyConverter.setHolderValueAsString(energyConverter.getHolderValueAsString() + "0");
        }
        inputLabel.setText(energyConverter.getHolderValueAsString());
    }
    
    
    //NUMBERS
    
    @FXML
    private void handleClearButtonAction(ActionEvent event) {
        energyConverter.sethValue("0.0");
        energyConverter.setInputNumber(0.0);
        energyConverter.setOutputNumber(0.0);
        energyConverter.setHolderValue(0.0);
        energyConverter.setDecimalCheck(false);
        inputLabel.setText("");
        outputLabel.setText("");
    }
    
    @FXML
    private void handleDecimalButtonAction(ActionEvent event) {
        if(energyConverter.getHolderValue() == 0.0 && energyConverter.isDecimalCheck() == false){
            energyConverter.setHolderValueAsString("0.");
        }
        else{
            if(energyConverter.isDecimalCheck() == false){
                energyConverter.setHolderValueAsString(energyConverter.getHolderValueAsString() + ".");
                energyConverter.setDecimalCheck(true);
            }
        }
        inputLabel.setText(energyConverter.getHolderValueAsString());
    }
    
    //MENU ITEM FUNCTIONS
    
    @FXML
    private void handleinMIAction(ActionEvent event){
        fromUnits.setText("J");
        fromText = "J";
    }
    @FXML
    private void handlenmMIAction(ActionEvent event){
        toUnits.setText("N m");
        toText = "N m";
    }
    @FXML
    private void handleergsMIAction(ActionEvent event){
        toUnits.setText("ergs");
        toText = "ergs";
    }
    @FXML
    private void handledynesMIAction(ActionEvent event){
        toUnits.setText("dynes cm");
        toText = "dynes cm";
    }
    @FXML
    private void handlekgMMIAction(ActionEvent event){
        toUnits.setText("kg m squared/s squared");
        toText = "kg m squared/s squared";
    }
    @FXML
    private void handlekWhMIAction(ActionEvent event){
        toUnits.setText("kW h");
        toText = "kW h";
    }
    @FXML
    private void handlecalMIAction(ActionEvent event){
        toUnits.setText("cal");
        toText = "cal";
    }
    @FXML
    private void handlekcalMIAction(ActionEvent event){
        toUnits.setText("kcal");
        toText = "kcal";
    }
    @FXML
    private void handleftLbMIAction(ActionEvent event){
        toUnits.setText("ft lb(force)");
        toText = "ft lb(force)";
    }
    @FXML
    private void handlebtuMIAction(ActionEvent event){
        toUnits.setText("Btu");
        toText = "Btu";
    }
    
    //MENU ITEM FUNCTIONS
    
    @FXML
    private void handleMenuButtonAction(ActionEvent event){
        Switchable.switchTo("Menu");
    }
    @FXML
    private void handleConvertButtonAction(ActionEvent event){
        if(!toText.equals("") && !fromText.equals("")){
            outputLabel.setText(Double.toString(energyConverter.convert(fromText, toText)));
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