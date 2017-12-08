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
public class LengthConverter implements Convert{
    private double inputNumber;
    private double outputNumber;
    private double holderValue;
    private String hValue;
    private boolean decimalCheck = false;
    
    public LengthConverter(){
        
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
        if(fromText.equals("m")){
            switch (toText) {
                case "cm":
                    value = value * 100;
                    return value;
                case "mm":
                    value = value * 1000;
                    return value;
                case "microns":
                    value = value * 10000000;
                    return value;
                case "angstroms":
                    value = value * 100000000000.0;
                    return value;
                case "in":
                    value = value * 39.37;
                    return value;
                case "ft":
                    value = value * 3.2808;
                    return value;
                case "yd":
                    value = value * 1.0936;
                    return value;
                case "mile":
                    value = value * 0.0006214;
                    return value;
                default:
                    return value;
            }
        }
        else{
            switch (toText) {
                case "cm":
                    value = value * 30.48;
                    return value;
                case "mm":
                    value = value * 0.3048;
                    value = value * 1000;
                    return value;
                case "microns":
                    value = value * 0.3048;
                case "angstroms":
                    value = value * 0.3048;
                case "in":
                    value = value * 12;
                    return value;
                case "m":
                    value = value * 0.3048;
                    return value;
                case "yd":
                    value = value * (1/3);
                    return value;
                case "mile":
                    value = value * 0.3048;
                    value = value * 0.0006214;
                    return value;
                default:
                    return value;
            }
        }
    }
    
}
