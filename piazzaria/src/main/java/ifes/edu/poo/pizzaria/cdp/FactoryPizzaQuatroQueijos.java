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
public class FactoryPizzaQuatroQueijos implements Fabrica {

    @Override
    public AbstractMassa criarMassa() {
        AbstractMassa massa = MassaTradicional.getInstance();
        return massa;
    }

    @Override
    public Recheio criarRecheio() {
        Parmesao queijo1 = Parmesao.getInstance();
        Mussarela queijo2 = Mussarela.getInstance();
        ArrayList<AbstractIngrediente> ingredientes = new ArrayList<>();
        ingredientes.add(queijo1);
        ingredientes.add(queijo2);
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
