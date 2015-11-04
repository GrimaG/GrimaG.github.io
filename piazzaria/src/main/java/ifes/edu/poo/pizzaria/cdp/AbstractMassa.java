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
public abstract class AbstractMassa {
    private String massa;

    public AbstractMassa(String massa) {
        this.massa = massa;
    }
    
    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }
    @Override
    public String toString() {
        return this.getMassa();
    }
}
