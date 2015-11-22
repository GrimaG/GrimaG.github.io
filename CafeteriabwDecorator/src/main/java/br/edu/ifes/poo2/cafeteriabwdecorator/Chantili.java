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
public class Chantili extends AbstractComplementos{

    public Chantili(Icafe cafe) {
        super(cafe);
    }
     protected String nome = "Chantili";
    private float price = (float) 1.00;

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public float getPrice() {
        return cafe.getPrice()+this.price;
    }
    
}
