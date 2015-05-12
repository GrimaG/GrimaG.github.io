/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.cgt;


import Model.cdp.Operador;
import Model.cdp.Sub;
import Model.cdp.Mult;
import Model.cdp.Div;
import Model.cdp.Add;
import Model.cdp.Parse;
import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author Gustavo
 */
public class AplControle {
    
    private HashMap<String, Operador> operadores = new HashMap<String, Operador>();  
    public AplControle() {
    inicializaOp();
     
}
    private void  inicializaOp(){
        operadores.put("+", new Add());
        operadores.put("-", new Sub());
        operadores.put("/", new Div());
        operadores.put("*", new Mult());
    }
    public float calculadora(String entrada){ 
        Operador operator;
        Stack pilha = new Stack();
        String value[];
        Parse converte = new Parse();
        float result = 0, val, numb;
        value = entrada.split(" ");
        for (String elemento: value){
            if (operadores.containsKey(elemento)){
                operator = operadores.get(elemento);
                numb=(float) pilha.pop();
                val=(float) pilha.pop();
                result = operator.calcula(val,numb);
                pilha.push(result);
            }
            else {
                try{
                numb= Float.parseFloat(elemento);
                pilha.push(new Float(numb));
                }
                catch(NumberFormatException numberFormatException){
                    System.out.println("Operador inválido");
                    return 0;
                }
            }
        }
        return(float) pilha.pop();
    }
        
}
