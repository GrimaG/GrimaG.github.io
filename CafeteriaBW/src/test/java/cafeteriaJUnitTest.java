/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.edu.ifes.poo2.cafeteriabw.CDP.AbstractFactoryCafe;
import br.edu.ifes.poo2.cafeteriabw.CDP.Dia;
import br.edu.ifes.poo2.cafeteriabw.CDP.FabricaCafe;
import br.edu.ifes.poo2.cafeteriabw.CDP.FabricaCafeNormal;
import br.edu.ifes.poo2.cafeteriabw.CDP.FabricaCappuccino;
import br.edu.ifes.poo2.cafeteriabw.CDP.FabricaSemCafeina;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Gustavo
 */
public class cafeteriaJUnitTest {
    public cafeteriaJUnitTest(){
    }
    @Test
    public  void testFabrica(){
        AbstractFactoryCafe fabrica;
        fabrica = new FabricaCafeNormal();
        assertEquals("Cafe Normal", fabrica.criarNome());
        fabrica = new FabricaCappuccino();
        assertEquals("Cafe Cappuccino", fabrica.criarNome());
        fabrica = new FabricaSemCafeina();
        assertEquals("Cafe Sem Cafeina", fabrica.criarNome());
    }
    @Test
    public void testFabricaGeral() throws Exception{
        FabricaCafe fabrica = new FabricaCafe();
        assertEquals("Cafe Normal", fabrica.fazerCafe("normal", Dia.TERCA).getTipoDeCafe());
        assertEquals("Cafe Cappuccino", fabrica.fazerCafe("cappuccino",Dia.TERCA).getTipoDeCafe());
        assertEquals("Cafe Sem Cafeina", fabrica.fazerCafe("sem cafeina", Dia.TERCA).getTipoDeCafe());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
