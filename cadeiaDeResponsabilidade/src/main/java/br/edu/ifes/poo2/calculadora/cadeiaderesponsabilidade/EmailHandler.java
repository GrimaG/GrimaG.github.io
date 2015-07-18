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
public interface EmailHandler {
   public void setNextHandler(EmailHandler handler);
   public void processHandler(String email);
}
