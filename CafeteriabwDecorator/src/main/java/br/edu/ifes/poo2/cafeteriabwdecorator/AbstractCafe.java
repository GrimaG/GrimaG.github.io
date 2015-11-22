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
public abstract class AbstractCafe implements Icafe {

    protected String nome;
    protected float price;

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

}
