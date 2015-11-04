/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.poo.pizzaria.cdp;

import java.util.HashMap;

/**
 *
 * @author Gustavo
 */
public class FactoryPizza {
    private static HashMap<String, Builder> construtor = new HashMap<>();   
    public FactoryPizza(){
        construtor.put("Quatro queijos tradicional", new FactoryPizzaQuatroQueijosBuilder());
        construtor.put("Mussarela tradicional", new FactoryPizzaMussarelaBuilder());
        construtor.put("Quatro queijos cone", new FactoryPizzaQuatroQueijosConeBuilder());
        construtor.put("Mussarela cone", new FactoryPizzaMussarelaConeBuilder());
        
    }
    public static Pizza criarPizza(String nome) {
        Cozinheiro cozinheiro = new Cozinheiro();
        Builder builder = construtor.get(nome);
        Pizza pizza = cozinheiro.montarPizza(builder);
        return pizza;
    }
}
