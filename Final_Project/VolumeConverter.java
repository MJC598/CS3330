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
public class VolumeConverter implements Convert{
    private double inputNumber;
    private double outputNumber;
    private double holderValue;
    private String hValue;
    private boolean decimalCheck = false;
    
    public VolumeConverter(){
        
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
        if(fromText.equals("m cubed")){
            switch (toText) {
                case "ft cubed":
                    value = value * 35.3145;
                    return value;
                case "L":
                    value = value * 1000;
                    return value;
                case "cm cubed":
                    value = value * 10000000;
                    return value;
                case "mL":
                    value = value * 10000000.0;
                    return value;
                case "gal":
                    value = value * 264.17;
                    return value;
                case "imperial gal":
                    value = value * 219.97;
                    return value;
                case "qt":
                    value = value * 1056.68;
                    return value;
                case "in cubed":
                    value = value * 35.3145;
                    value = value * 1728;
                    return value;
                default:
                    return value;
            }
        }
        else{
            switch (toText) {
                case "in cubed":
                    value = value * 1728;
                    return value;
                case "gal":
                    value = value * 7.4805;
                    return value;
                case "qt":
                    value = value * 29.992;
                case "m cubed":
                    value = value * 0.028317;
                case "L":
                    value = value * 28.317;
                    return value;
                case "imperial gal":
                    value = value * 0.028317;
                    value = value * 219.97;
                    return value;
                case "cm cubed":
                    value = value * 0.028317;
                    value = value * 10000000;
                    return value;
                case "mL":
                    value = value * 0.028317;
                    value = value * 10000000;
                    return value;
                default:
                    return value;
            }
        }}
    
}
