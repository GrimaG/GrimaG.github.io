/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.edu.ifes.poo2.templatemethod.AVI;
import br.edu.ifes.poo2.templatemethod.AbstractPlayer;
import br.edu.ifes.poo2.templatemethod.MP3;
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
public class testAVI {
     AbstractPlayer player;
    public testAVI() {
    }
    
    @Before
    public void before() {
        player = new AVI();
    }
    
    @Test
    public void testAVI() {

        assertTrue(player.rodaPlayer());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
