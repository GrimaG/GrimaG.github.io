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
public abstract class AbstractNavio implements Navio{
    int pessoas;
    int carga;
    Tipos tipo;
    
   
    public abstract void setQtd(int pessoas, int carga);
}
