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
public class Gorgonzola extends AbstractQueijo {
    private static Gorgonzola queijo;
    private Gorgonzola(int quantidade) {
        super("Gorgonzola", quantidade);
    }
    public static synchronized Gorgonzola getInstance(){
        if (queijo == null){
            queijo = new Gorgonzola(1);
        }
        return queijo;                
    }

    
}
