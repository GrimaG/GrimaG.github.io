/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cafeteriabwdecorator;

/**
 *
 * @author Gustavo
 */
public class Cafe extends AbstractCafe{
    
    @Override
    public float getPrice() {
        return price=(float) 1.00;
    }

    @Override
    public String getNome() {
        return nome;
    }
    
}
