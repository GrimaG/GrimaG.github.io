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
public abstract class AbstractIngrediente {
    String nome;
    private int qtd;

    public AbstractIngrediente(String nome, int quantidade) {
        this.nome = nome;
        this.qtd = quantidade;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return qtd;
    }

    public void setQuantidade(int quantidade) {
        this.qtd = quantidade;
    }
}
