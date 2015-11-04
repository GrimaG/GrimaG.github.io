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
public class FactoryPizzaMussarelaCone implements Fabrica {

@Override
    public AbstractMassa criarMassa() {
        MassaCone massa = MassaCone.getInstance();
        return massa;               
    }

    @Override
    public Recheio criarRecheio() {
        Mussarela mussarela = Mussarela.getInstance();
        Gorgonzola gorgonzola= Gorgonzola.getInstance();
        Presunto presunto = Presunto.getInstance();
        Cebola cebola = Cebola.getInstance();
        ArrayList<AbstractIngrediente> ingredientes = new ArrayList<>();
        ingredientes.add(mussarela);
        ingredientes.add(gorgonzola);
        ingredientes.add(cebola);
        ingredientes.add(presunto);
        return new Recheio(ingredientes);                

    }

    @Override
    public AbstractMolho criarMolho() {
        AbstractMolho molho = MolhoTomate.getInstance();
        return molho;
    }

    @Override
    public Pizza criarPizza() {
        return new Pizza();
    }
    
}
