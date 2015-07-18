/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.calculadora.cadeiaderesponsabilidade;

/**
 *
 * @author Gustavo
 */
public abstract class AbstractEmailHandler implements EmailHandler{
    private EmailHandler nextHandler;
    @Override
    public void setNextHandler(EmailHandler handler) {
        nextHandler = handler;
    }

    @Override
    public void processHandler(String email) {
        boolean wordfound = false;
        if(matchingWords().length == 0){
            wordfound = true;
        }
        else {
            for (String word: matchingWords()){
                if (email.indexOf(word)>=0){
                    wordfound = true;
                    break;
                }
            }
        }
        if (wordfound){
            handleHere(email);
        }else nextHandler.processHandler(email);
    }
    protected abstract String[] matchingWords();
    protected abstract void handleHere(String email);
    
}
