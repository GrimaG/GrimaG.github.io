/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.fabricanavios;

/**
 *
 * @author Gustavo
 */
public class Ship extends AbstractNavio{

  
    public void setQtd(int setPessoas, int setCarga) {
        this.pessoas = setPessoas;
        this.carga = setCarga;
    }

    @Override
    public Navio clone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
