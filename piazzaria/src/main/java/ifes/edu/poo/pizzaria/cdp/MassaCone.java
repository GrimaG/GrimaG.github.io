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
public class MassaCone extends AbstractMassa {
    private static MassaCone massa;
    
    private MassaCone() {
        super("Cone");
    }
    public static synchronized MassaCone getInstance(){
        if(massa == null)
            massa = new MassaCone();
        return massa;
    }


    
}
