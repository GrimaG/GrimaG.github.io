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
public class MolhoTomate extends AbstractMolho {
    private static MolhoTomate molho;
    
    private MolhoTomate() {
        super("Molho de tomate", 1);
    }
    public static synchronized MolhoTomate getInstance(){
        if(molho == null)
            molho = new MolhoTomate();
        return molho;
    }

    
}
