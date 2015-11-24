/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.pizariatacomfome;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gustavo
 */
public class FlyweightPizzas {
    Map<String, Ipizza> pizzas;
    

    public FlyweightPizzas() {
        this.pizzas = new HashMap<String,Ipizza>();
    }
    public Ipizza getPizza(String tipo){
        FabricaPizza fabrica = new FabricaPizza();
        Ipizza pizza = pizzas.get(tipo);
        if (pizza == null){
            pizza = fabrica.criarPizza(tipo);
            pizzas.put(tipo, pizza);
        }
        return pizza;
    }
}
