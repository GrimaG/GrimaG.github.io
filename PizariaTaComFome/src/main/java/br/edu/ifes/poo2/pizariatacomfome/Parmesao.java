/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.pizariatacomfome;

/**
 *
 * @author Gustavo
 */
public class Parmesao extends AbstractIngredientes {

    public Parmesao(Ipizza pizza) {
        super(pizza);
    }

    @Override
    public float getPreco() {
        return pizza.getPreco() + 1;
    }
}
