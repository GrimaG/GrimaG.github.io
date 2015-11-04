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
public class Provolone extends AbstractQueijo {

    private static Provolone queijo;
    private Provolone(int quantidade) {
        super("Provolone", quantidade);
    }
    private synchronized static Provolone getInstance(){
        if (queijo == null){
            queijo = new Provolone(1);
        }
        return queijo;                
    }
    
}
