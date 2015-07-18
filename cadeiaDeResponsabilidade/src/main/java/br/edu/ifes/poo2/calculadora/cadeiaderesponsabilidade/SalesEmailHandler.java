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
public class SalesEmailHandler extends AbstractEmailHandler{

    @Override
    protected String[] matchingWords() {
        return new String[]{"buy","purchase"};
    }

    @Override
    protected void handleHere(String email) {
        System.out.println("Email handled by sales departament.");
    }
    
}
