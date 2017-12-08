/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjc6r9converter;

/**
 *
 * @author mcarroll
 */
public class ForceConverter implements Convert{
    private double inputNumber;
    private double outputNumber;
    private double holderValue;
    private String hValue;
    private boolean decimalCheck = false;
    
    public ForceConverter(){
        
    }
    
    public double getInputNumber() {
        return inputNumber;
    }

    /**
     * @param inputNumber the inputNumber to set
     */
    public void setInputNumber(double inputNumber) {
        this.inputNumber = inputNumber;
    }

    /**
     * @return the outputNumber
     */
    public double getOutputNumber() {
        return outputNumber;
    }

    /**
     * @param outputNumber the outputNumber to set
     */
    public void setOutputNumber(double outputNumber) {
        this.outputNumber = outputNumber;
    }

    /**
     * @return the holderValue
     */
    public double getHolderValue() {
        return holderValue;
    }

    /**
     * @param holderValue the holderValue to set
     */
    public void setHolderValue(double holderValue) {
        this.holderValue = holderValue;
    }

    /**
     * @return the hValue
     */
    public String gethValue() {
        return hValue;
    }

    /**
     * @param hValue the hValue to set
     */
    public void sethValue(String hValue) {
        this.hValue = hValue;
    }
    
    public String getHolderValueAsString() {
        System.out.println(holderValue);
        return hValue;
    }
    
    public void setHolderValueAsString(String value) {
        this.hValue = value;
        if(!value.equals("")){
            holderValue = Double.parseDouble(value);
        }
    }

    /**
     * @param decimalCheck the decimalCheck to set
     */
    public void setDecimalCheck(boolean decimalCheck) {
        this.decimalCheck = decimalCheck;
    }

    /**
     * @return the decimalCheck
     */
    public boolean isDecimalCheck() {
        return decimalCheck;
    }

    @Override
    public double convert(String fromText, String toText) {
        double value = holderValue;
        if(toText.equals("N")){
            if(fromText.equals("kg m/s squared")){
                return value;
            }
            else if(toText.equals("dynes")){
                value = value * 1000000;
                return value;
            }
            else if(toText.equals("g cm/s squared")){
                value = value * 1000000;
                return value;
            }
            else if(toText.equals("lb(force)")){
                value = value * 0.22481;
                return value;
            }             
            else if(toText.equals("lb(mass) ft/s squared")){
                value = value * .22481;
                value = value * 32.174;
                return value;
            }
            else{
                return value;
            }
        }
        else{
            if(fromText.equals("kg m/s squared")){
                value = value /.22481;
                return value;
            }
            else if(toText.equals("dynes")){
                value = value * 444820;
                return value;
            }
            else if(toText.equals("g cm/s squared")){
                value = value / .22481;
                value = value * 1000000;
                return value;
            }
            else if(toText.equals("N")){
                value = value * 4.4482;
                return value;
            }             
            else if(toText.equals("lb(mass) ft/s squared")){
                value = value * 32.174;
                return value;
            }
            else{
                return value;
            }
        }
    }
}
