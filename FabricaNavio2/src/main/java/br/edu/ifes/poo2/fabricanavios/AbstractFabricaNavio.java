/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.fabricanavios;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo
 */
public abstract class AbstractFabricaNavio implements IntFabricaNavio{
    public abstract Ship criarNavio(int pessoa, int carga);

    @Override
    public AbstractFabricaNavio clone() {
        AbstractFabricaNavio obj = null;
        try {
            obj = (AbstractFabricaNavio) super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(AbstractNavio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
}
