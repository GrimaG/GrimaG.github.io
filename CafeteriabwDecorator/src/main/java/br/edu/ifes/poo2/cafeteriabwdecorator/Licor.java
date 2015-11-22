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
public class Licor extends AbstractComplementos{
    protected String nome = "Licor";
    private float price = (float) 2.50;

    public Licor(Icafe cafe) {
        super(cafe);
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public float getPrice() {
        return cafe.getPrice()+this.price;
    }
}
