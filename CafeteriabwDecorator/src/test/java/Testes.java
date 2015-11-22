/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.edu.ifes.poo2.cafeteriabwdecorator.Cafe;
import br.edu.ifes.poo2.cafeteriabwdecorator.Chantili;
import br.edu.ifes.poo2.cafeteriabwdecorator.Chocolate;
import br.edu.ifes.poo2.cafeteriabwdecorator.CremeLaranja;
import br.edu.ifes.poo2.cafeteriabwdecorator.Icafe;
import br.edu.ifes.poo2.cafeteriabwdecorator.Licor;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Gustavo
 */
public class Testes {
    Icafe cafe;
    
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
        cafe = new Cafe();
    }
    @Test
    public void testChantili() {
        cafe = new Chantili(cafe);
        Assert.assertEquals((float)2.0, cafe.getPrice(),0.0001);
    }
    @Test
    public void testChocolate() {
        cafe = new Chocolate(cafe);
        Assert.assertEquals((float)1.5, cafe.getPrice(),0.0001);
    }
    @Test
    public void testCremeLaranja() {
        cafe = new CremeLaranja(cafe);
        Assert.assertEquals((float)2.5, cafe.getPrice(), 0.0001);
    }
    @Test
    public void testLicor() {
        cafe = new Licor(cafe);
        Assert.assertEquals((float)3.5, cafe.getPrice(), 0.0001);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
