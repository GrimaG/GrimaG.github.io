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
public class MassaTradicional extends AbstractMassa {

    private static MassaTradicional massa;
    
    private MassaTradicional() {
        super("Tradicional");
    }
    public static synchronized MassaTradicional getInstance(){
        if(massa == null)
            massa = new MassaTradicional();
        return massa;
    }

}
