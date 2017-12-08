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
public class MassConverter implements Convert{
    private double inputNumber;
    private double outputNumber;
    private double holderValue;
    private String hValue;
    private boolean decimalCheck = false;
    
    public MassConverter(){
        
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
        if(fromText.equals("kg")){
            switch (toText) {
                case "g":
                    value = value * 1000;
                    return value;
                case "metric ton":
                    value = value * 0.001;
                    return value;
                case "lb":
                    value = value * 2.20462;
                    return value;
                case "oz":
                    value = value * 35.27392;
                    return value;
                case "ton":
                    value = value / 2.20462;
                    value = value * 0.0005;
                    return value;
                default:
                    return value;
            }
        }
        else{
            switch (toText) {
                case "g":
                    value = value * 453.593;
                    return value;
                case "metric ton":
                    value = value * 0.453593;
                    value = value * 0.001;
                    return value;
                case "kg":
                    value = value * 0.453593;
                    return value;
                case "oz":
                    value = value * 16;
                    return value;
                case "ton":
                    value = value * 0.0005;
                    return value;
                default:
                    return value;
            }
        }
    }
    
}
