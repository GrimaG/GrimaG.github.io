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
public class Chocolate extends AbstractComplementos{

    public Chocolate(Icafe cafe) {
        super(cafe);
    }
     protected String nome = "Chocolate";
    private float price = (float) 0.50;

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public float getPrice() {
        return cafe.getPrice()+this.price;
    }
}
