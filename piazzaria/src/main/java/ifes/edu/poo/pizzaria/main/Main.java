/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.poo.pizzaria.main;

import ifes.edu.poo.pizzaria.cdp.Pizza;
import ifes.edu.poo.pizzaria.cdp.FactoryPizza;

/**
 *
 * @author Gustavo
 */
public class Main {
    public static void main(String args[]) {
        FactoryPizza fabricaDePizza = new FactoryPizza();
        Pizza pizza = fabricaDePizza.criarPizza("Mussarela cone");
        System.out.println(pizza);
        pizza= fabricaDePizza.criarPizza("Quatro queijos tradicional");
        System.out.println(pizza);
        
    }
}
