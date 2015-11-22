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
public class CremeLaranja extends AbstractComplementos{
    

    public CremeLaranja(Icafe cafe) {
        super(cafe);
    }
     protected String nome = "Creme de Laranja";
    private float price = (float) 1.50;

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public float getPrice() {
        return cafe.getPrice()+this.price;
    }
}
