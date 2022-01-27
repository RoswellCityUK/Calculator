/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator;

/**
 *
 * @author Tomasz Grabowski
 */
public class Input {
    private String input = "0";
    
    public void addAtEnd(String input){
        if(Double.parseDouble(this.input) == 0 && !input.equalsIgnoreCase(".")){
            this.input = input;
        }else{
            this.input += input;
        }
    }
    
    public String get(){
        return this.input;
    }
    public double getDouble(){
        return Double.parseDouble(this.input);
    }
    public void set(String input){
        this.input = input;
    }
    
    public void clear(){
        this.input = "0";
    }
    
    public void backspace(){
        this.input = this.input.substring(0, this.input.length()-1);
    }
    
    public void changeSign(){
        if (Double.parseDouble(this.input)<0){
            this.input = this.input.substring(1, this.input.length());
        }else if (Double.parseDouble(this.input)==0){
            this.input = this.input;
        }else{
            this.input = "-" + this.input;
        }
        
    }
}
