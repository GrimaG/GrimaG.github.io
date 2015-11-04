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
public class Presunto extends AbstractIngrediente {
    private static Presunto presunto;
    private Presunto(int quantidade) {
        super("Presunto", quantidade);
    }
    public static synchronized Presunto getInstance(){
        if(presunto == null)
            presunto = new Presunto(1);
        return presunto;
    }
    @Override
    public String toString() {
        return this.nome;
    }
    
}
