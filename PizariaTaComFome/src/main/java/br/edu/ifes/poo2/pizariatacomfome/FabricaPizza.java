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
public  class FabricaPizza {
    AbstractFabricaPizza fabrica;
    public Ipizza criarPizza(String tipo){
        if (tipo.equals("Mussarela")){
            fabrica = new PizzaMussarela();
        }
        if (tipo.equals("Provolone")){
            fabrica = new PizzaProvolone();
        }
        return fabrica.criarPizza();
    }
}
