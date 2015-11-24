/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.edu.ifes.poo2.pizariatacomfome.FlyweightPizzas;
import br.edu.ifes.poo2.pizariatacomfome.Ipizza;
import br.edu.ifes.poo2.pizariatacomfome.MassaCone;
import br.edu.ifes.poo2.pizariatacomfome.MassaTradicional;
import br.edu.ifes.poo2.pizariatacomfome.MolhoTomate;
import br.edu.ifes.poo2.pizariatacomfome.Mussarela;
import br.edu.ifes.poo2.pizariatacomfome.Pizza;
import br.edu.ifes.poo2.pizariatacomfome.Provolone;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Gustavo
 */
public class Testes {
    Ipizza pizzaTradicional;
    Ipizza pizzaProvolone;
    FlyweightPizzas pizzaria;
    
    public Testes() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pizzaTradicional = new Pizza();
        pizzaProvolone = new Pizza();
        pizzaria = new FlyweightPizzas();
    }
    
    @Test
    public void testMassa() {
        pizzaTradicional = new MassaTradicional(pizzaTradicional);
        Assert.assertEquals(pizzaTradicional.getPreco(), 5, 0.0001);
        pizzaProvolone = new MassaCone(pizzaProvolone);
        Assert.assertEquals(pizzaProvolone.getPreco(), 10, 0.0001);

    }
    @Test
    public void testComplementos() {
        pizzaTradicional = new MassaTradicional(pizzaTradicional);
        pizzaProvolone = new MassaCone(pizzaProvolone);
        pizzaTradicional = new MolhoTomate(pizzaTradicional);
        pizzaTradicional = new Mussarela(pizzaTradicional);
        pizzaProvolone = new MolhoTomate(pizzaProvolone);
        pizzaProvolone = new Provolone(pizzaProvolone);
        Assert.assertEquals(pizzaTradicional.getPreco(), 9, 0.0001);
        Assert.assertEquals(pizzaProvolone.getPreco(), 14, 0.0001);
        Assert.assertEquals(pizzaTradicional.getPreco(), pizzaria.getPizza("Mussarela").getPreco(), 0.0001);
        Assert.assertEquals(pizzaProvolone.getPreco(), pizzaria.getPizza("Provolone").getPreco(), 0.0001);
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
