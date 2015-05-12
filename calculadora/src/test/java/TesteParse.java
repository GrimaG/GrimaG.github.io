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
public class TesteParse {
    Parse parse;
     @Before
    public void before() {
        parse= new Parse();
    }
    
 
      @Test
    public void convertSemParentese(){
        String resultado = parse.parse("5+1");
        assertEquals("5 1 +", resultado);
    }
    
    @Test
    public void convertSemParentesePrioridade(){
        String resultado = parse.parse("5+1*3");
        assertEquals("5 1 3 * +", resultado);
    }
    
    @Test
    public void convertParenteseSemPrioridade(){
        String resultado = parse.parse("(5+1)*3");
        assertEquals("5 1 + 3 *", resultado);
    }
    
    @Test
    public void convertParenteseComPrioridade(){
        String resultado = parse.parse("(5+1*3)/2");
        assertEquals("5 1 3 * + 2 /", resultado);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
