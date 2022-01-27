/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator;

import java.text.DecimalFormat;

/**
 *
 * @author Tomasz Grabowski
 */
public class Operation {
    
    private String firstNumber = "0";
    private String secondNumber = "0";
    private String operation = "";
    private double result = 0;
    private String memory = "0";
    private boolean isCalculated = false;
    
    public void setFirstNumber(String number, String operation){
        this.firstNumber = number;
        this.operation = operation;
    }
    public String getFirstNumber(){
        return this.firstNumber;
    }
    
    public void setSecondNumber(String input){
        this.secondNumber = input;
    }
    public String getSecondNumber(){
        return this.secondNumber;
    }
    
    public double getNumberDouble(int number){
        if(number == 1){
            return Double.parseDouble(this.firstNumber);
        }else if(number == 2){
            return Double.parseDouble(this.secondNumber);
        }else{
            return 0;
        }
    } 
    
    public String getOperation(){
        return this.operation;
    }
    public String getOperationString(){
        DecimalFormat format = new DecimalFormat("0.#####");
        if(this.isCalculated){
            return format.format(Double.parseDouble(this.firstNumber)) + " " + this.operation + " " + format.format(Double.parseDouble(this.secondNumber)) + " =";
        }else{
            return format.format(Double.parseDouble(this.firstNumber)) + " " + this.operation + " ";
        }
    }
    
    public void setResult(double input){
        this.result = input;
    }
    
    public double getResult(){
        return this.result;
    }
    
    public boolean calculateResult(){ 
        this.isCalculated = false;   
        if(!"".equals(this.operation)){
            switch(this.operation){
                case "/" -> setResult(getNumberDouble(1) / getNumberDouble(2));
                case "*" -> setResult(getNumberDouble(1) * getNumberDouble(2));
                case "-" -> setResult(getNumberDouble(1) - getNumberDouble(2));
                case "+" -> setResult(getNumberDouble(1) + getNumberDouble(2));
                case "sqrt" -> setResult(Math.pow(getNumberDouble(1), 1/getNumberDouble(2)));
                case "pow" -> setResult(Math.pow(getNumberDouble(1), getNumberDouble(2)));
                case "1/x" -> setResult(1/getNumberDouble(1));
                default -> {}
            }
            this.isCalculated = true;
        }
        
        return this.isCalculated;
    }
    
    public void memoryClear(){
        this.memory = "0";
    }
    public String memoryRecall(){
        return this.memory;
    }
    public void memoryAdd(String input){
        this.memory = String.valueOf(Double.parseDouble(this.memory) + Double.parseDouble(input));
    }
    public void memorySubstract(String input){
        this.memory = String.valueOf(Double.parseDouble(this.memory) - Double.parseDouble(input));
    }
    public void memoryStore(String input){
        this.memory = input;
    }
    
    public void clear(){
        this.firstNumber = "0";
        this.secondNumber = "0";
        this.operation = "";
        this.result = 0;
        this.memory = "0";
        this.isCalculated = false;
    }
}
