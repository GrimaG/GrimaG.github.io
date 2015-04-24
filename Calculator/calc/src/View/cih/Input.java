/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.cih;



import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Input {
     Scanner input = new Scanner( System.in ); 
    
    public String getVal(){
        String value="";
        begin();
        while(value.isEmpty()){
        calcular();
        value = input.nextLine();
    }
       
       return value;
    }
    
    public void showVal(Float value){
        retorno(value);
    }
     public void begin(){
            System.out.println("**************Calculadora****************");
}
    public void calcular(){
            System.out.println("Calcular");
    }
    public void retorno(float result){
         System.out.println("Resultado: "+result);
    }
}
