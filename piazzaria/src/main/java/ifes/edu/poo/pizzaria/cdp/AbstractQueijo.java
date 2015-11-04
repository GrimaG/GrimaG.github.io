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
public abstract class AbstractQueijo extends AbstractIngrediente {

    public AbstractQueijo(String nome, int quantidade) {
        super(nome, quantidade);
    }
    @Override
    public String toString() {
        return this.nome;
    }
    
}
