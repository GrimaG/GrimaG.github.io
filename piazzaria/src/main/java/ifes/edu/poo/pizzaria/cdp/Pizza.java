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
public class Pizza implements Cloneable {
    private AbstractMolho molho;
    private Recheio recheio;
    private AbstractMassa massa;

    public AbstractMolho getMolho() {
        return molho;
    }

    public void setMolho(AbstractMolho molho) {
        this.molho = molho;
    }

    public Recheio getRecheio() {
        return recheio;
    }

    public void setRecheio(Recheio recheio) {
        this.recheio = recheio;
    }

    public AbstractMassa getMassa() {
        return massa;
    }

    public void setMassa(AbstractMassa massa) {
        this.massa = massa;
    }

    @Override
    public String toString() {
        return this.molho + " " + this.recheio + " " + this.massa;
    }
    
}
