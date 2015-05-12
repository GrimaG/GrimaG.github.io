/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class TestAplControle {
    
          
       AplControle polonesa;
       
     @Before
    public void before() {
        polonesa =new  AplControle();
        
    }
    
    @Test
    public void testeValueNoPriority(){
        float result = polonesa.calculadora("5 1 +");
        assertEquals(6, result, 0.0f);
    }
      @Test
    public void testeValuePriority(){
        float result = polonesa.calculadora("5 1 3 * +");
        assertEquals(8, result, 0.0f);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
