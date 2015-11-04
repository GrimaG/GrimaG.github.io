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
public class Parmesao extends AbstractQueijo {

    private static Parmesao queijo;
    private Parmesao(int quantidade) {
        super("Parmesao", quantidade);
    }
    public static synchronized Parmesao getInstance(){
        if (queijo == null){
            queijo = new Parmesao(1);
        }
        return queijo;                
    }

}
