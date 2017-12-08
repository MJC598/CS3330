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
public class EnergyConverter implements Convert{
    private double inputNumber;
    private double outputNumber;
    private double holderValue;
    private String hValue;
    private boolean decimalCheck = false;
    
    public EnergyConverter(){
        
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
        switch (toText) {
            case "N m":
                return value;
            case "ergs":
                value = value * 100000000;
                return value;
            case "dynes cm":
                value = value * 100000000;
                return value;
            case "kg m squared/s squared":
                return value;
            case "kW h":
                value = value * .0000002778;
                return value;
            case "cal":
                value = value * 0.23901;
                return value;
            case "kcal":
                value = value * 0.00023901;
                return value;
            case "ft lb(force)":
                value = value * .7376;
                return value;
            default:
                value = value * 0.0009486;
                return value;
        }
    }    
}
