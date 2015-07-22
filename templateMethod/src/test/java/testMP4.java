/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.edu.ifes.poo2.templatemethod.AbstractPlayer;
import br.edu.ifes.poo2.templatemethod.MP3;
import br.edu.ifes.poo2.templatemethod.MP4;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static sun.audio.AudioPlayer.player;

/**
 *
 * @author Gustavo
 */
public class testMP4 {
    AbstractPlayer player;
    public testMP4() {
    }
    
       
    @Before
    public void before() {
        player = new MP4();
    }
    
    @Test
    public void testMP4() {

        assertTrue(player.rodaPlayer());
    }

    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
