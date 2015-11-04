/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ifes.edu.poo.pizzaria.cdp.FactoryPizza;
import ifes.edu.poo.pizzaria.cdp.FactoryPizzaMussarelaConeBuilder;
import ifes.edu.poo.pizzaria.cdp.Pizza;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gustavo
 */
public class TestePizzaria {
    
    public TestePizzaria() {
    }
   @Test
   public void testCriarPizza(){
       FactoryPizza fabricaDePizza = new FactoryPizza();
       Pizza pizza = fabricaDePizza.criarPizza("Mussarela cone");
       assertEquals(new Pizza().getClass(),fabricaDePizza.criarPizza("Mussarela cone").getClass());
   }
   @Test
   public void testCriarPizzaMussarelaCone(){
       FactoryPizza fabricaDePizza = new FactoryPizza();
       Pizza pizza = fabricaDePizza.criarPizza("Mussarela cone");
       assertEquals(pizza.getMassa().toString(),"Cone" );
       assertEquals(pizza.getMolho().toString(),"Molho de tomate" );
   }
   @Test
   public void testCriarPizzaTradicional(){
       FactoryPizza fabricaDePizza = new FactoryPizza();
       Pizza pizza = fabricaDePizza.criarPizza("Mussarela tradicional");
       assertEquals(pizza.getMassa().toString(),"Tradicional" );
       assertEquals(pizza.getMolho().toString(),"Molho de tomate" );
   }
   @Test
   public void testCriarPizzaQuatroqueijos(){
       FactoryPizza fabricaDePizza = new FactoryPizza();
       Pizza pizza = fabricaDePizza.criarPizza("Quatro queijos tradicional");
       assertEquals(pizza.getMassa().toString(),"Tradicional" );
       assertEquals(pizza.getMolho().toString(),"Molho de tomate" );
   }
}
