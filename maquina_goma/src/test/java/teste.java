/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.edu.ifes.poo2.maquina_goma.Controller;
import br.edu.ifes.poo2.maquina_goma.ControllerState;
import br.edu.ifes.poo2.maquina_goma.MoedaRecebida;
import br.edu.ifes.poo2.maquina_goma.SemMoeda;
import java.io.ByteArrayOutputStream;
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
public class teste {
     Controller controler;
    public teste() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       controler = new Controller();

    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test() {
         final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        controler.imprime();    
        assertEquals(outContent.toString(), "Sem moeda!");
    }
}
