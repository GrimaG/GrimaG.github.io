/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.cdp.Add;
import Model.cdp.Div;
import Model.cdp.Mult;
import Model.cdp.Operador;
import Model.cdp.Parse;
import Model.cdp.Sub;
import Model.cgt.AplControle;
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
public class TestOperadores {
    
      
       Operador operador;
       
     @Before
    public void before() {
        
        
    }
    
    @Test
    public void deveSomar(){
        operador = new Add();
        float resultado = operador.calcula(5, 1);
        assertEquals(6, resultado, 0.0f);
    }
    
    @Test
    public void deveSubtrair(){
        operador = new Sub();
        float resultado = operador.calcula(5, 1);
        assertEquals(4, resultado, 0.0f);
    }
        @Test
    public void deveDividir(){
        operador = new Div();
        float resultado = operador.calcula(5, -5);
        assertEquals(-1, resultado, 0.0f);
    }
    @Test
    public void ndeveDividirPorZero(){
        operador = new Div();
        float resultado = operador.calcula(5, 0);
        assertEquals(0, resultado, 0.0f);
    }
    @Test
    public void deveMultiplicar(){
        operador = new Mult();
        float resultado = operador.calcula(7, 1);
        assertEquals(7, resultado, 0.0f);
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
