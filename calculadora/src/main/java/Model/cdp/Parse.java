/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.cdp;

import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author Gustavo
 */
public class Parse {
    private HashMap<Character, Integer> prioridade = new HashMap<Character, Integer>(); 
    
    public Parse(){
        prioridade.put('+', 1);
        prioridade.put('-', 1);
        prioridade.put('/', 2);
        prioridade.put('*', 2);
    }
    public String  parse(String exp){
       String  polonesaInversa ="";
       Stack pilhaOperadores = new Stack();
       int prioridadeAnterior=0, prioridadeAtual=0;
       for (int index=0; index<exp.length(); index++){
           if(prioridade.containsKey(exp.charAt(index))){
               prioridadeAtual=prioridade.get(exp.charAt(index));
               if(prioridadeAtual>prioridadeAnterior){
                   pilhaOperadores.push(exp.charAt(index));
               }
               else {
                   for(int ref=0; ref<=pilhaOperadores.size(); ref++)    polonesaInversa += " "+pilhaOperadores.pop();
                   pilhaOperadores.push(exp.charAt(index));
               }
               prioridadeAnterior=prioridadeAtual;
           }
           else{
               if("(".equals(String.valueOf(exp.charAt(index)))){
                   String operacaoInterna="";
                   index++;
                   while(!")".equals(String.valueOf(exp.charAt(index)))){
                       operacaoInterna+=exp.charAt(index);
                       index++;
                   } 
                   polonesaInversa+=" "+parse(operacaoInterna);
                   index++;
               }
                if(!" ".equals(String.valueOf(exp.charAt(index)))){
                   String numero="";
                   while(index<exp.length() && !prioridade.containsKey(exp.charAt(index))){
                       numero+=exp.charAt(index);
                       index++;
                   }
                   index--;
                   if(numero!="") polonesaInversa += " "+numero;
               }
           }   
       }
       for(int ref=0; ref<=pilhaOperadores.size(); ref++)  polonesaInversa += " "+pilhaOperadores.pop();
       polonesaInversa= polonesaInversa.substring(1);
       return polonesaInversa;
    }
}
