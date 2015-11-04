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
public class Margherita extends AbstractQueijo {
    private static Margherita queijo;
    private Margherita(int quantidade) {
        super("Margherita", quantidade);
    }
    private synchronized static Margherita getInstance(){
        if (queijo == null){
            queijo = new Margherita(1);
        }
        return queijo;                
    }

    
}
