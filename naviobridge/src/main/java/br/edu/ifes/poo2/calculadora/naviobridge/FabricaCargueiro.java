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
public class FabricaCargueiro extends AbstractFabricaNavio{
    Ship navio = new Ship();
    @Override
    public Ship criarNavio(int pessoa, int carga) {
        Tipos.CARGA.setVal(carga, pessoa);// o moodle fora do ar nao consigo ver quanto é o lmite max D:
        this.navio.setTipo(Tipos.CARGA);
        this.navio.setQtd(pessoa, carga);  
        return navio;
    }
  
    
}