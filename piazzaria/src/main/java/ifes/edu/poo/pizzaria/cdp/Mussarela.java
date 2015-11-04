/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.poo.pizzaria.cdp;

/**
 *
 * @author Gustavo
 */
public class Mussarela extends AbstractQueijo {
    private static Mussarela queijo;
    private Mussarela(int quantidade) {
        super("Provolone", quantidade);
    }
    public static synchronized Mussarela getInstance(){
        if (queijo == null){
            queijo = new Mussarela(1);
        }
        return queijo;                
    }

    
}
