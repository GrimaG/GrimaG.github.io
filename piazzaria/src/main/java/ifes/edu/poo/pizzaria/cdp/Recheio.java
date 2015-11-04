/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.poo.pizzaria.cdp;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class Recheio {
    private ArrayList<AbstractIngrediente> itens;

    public Recheio(ArrayList<AbstractIngrediente> ingredientes) {
        this.itens = ingredientes;
    }

    public ArrayList<AbstractIngrediente> getIngrediente() {
        return itens;
    }

    public void setIngrediente(ArrayList<AbstractIngrediente> ingrediente) {
        this.itens = ingrediente;
    }

    @Override
    public String toString() {
        StringBuilder st = new StringBuilder();
        for (AbstractIngrediente i: itens){
            st.append(i).append(" ");
        }
        return st.toString();
    }
    
}
