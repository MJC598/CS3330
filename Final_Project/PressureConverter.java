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
public class PressureConverter implements Convert{
    private double inputNumber;
    private double outputNumber;
    private double holderValue;
    private String hValue;
    private boolean decimalCheck = false;
    
    public PressureConverter(){
        
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
                case "Pa":
                    value = value * 0.0000101325;
                    return value;
                case "kPa":
                    value = value * 101.325;
                    return value;
                case "bar":
                    value = value * 1.01325;
                    return value;
                case "dynes/cm squared":
                    value = value * 0.00000101325;
                    return value;
                case "PSI":
                    value = value * 14.696;
                    return value;
                case "torr":
                    value = value * 760;
                    return value;
                default:
                    return value;
            }
    }
    
}
