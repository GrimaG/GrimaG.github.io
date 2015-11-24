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
public class PizzaProvolone extends AbstractFabricaPizza{

    @Override
    Ipizza criarPizza() {
        Ipizza pizza = new Pizza();
        pizza = new MassaCone(pizza);
        pizza = new MolhoTomate(pizza);
        pizza = new Provolone(pizza);
        return pizza;
    }
    }
    

