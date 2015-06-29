/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.calculadora.naviobridge;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo
 */
public abstract class AbstractNavio implements Navio{
    private int pessoas;
    private int carga;
    private Tipos tipo;
    
   
    public abstract void setQtd(int pessoas, int carga);

    /**
     * @return the pessoas
     */
    public int getPessoas() {
        return pessoas;
    }

    /**
     * @param pessoas the pessoas to set
     */
    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    /**
     * @return the carga
     */
    public int getCarga() {
        return carga;
    }

    /**
     * @param carga the carga to set
     */
    public void setCarga(int carga) {
        this.carga = carga;
    }

    /**
     * @return the tipo
     */
    public Tipos getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }
}
