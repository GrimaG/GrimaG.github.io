/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.calculadora.naviobridge;

/**
 *
 * @author Gustavo
 */
public enum Tipos {
    CRUZEIRO, CARGA, ESCUNA, GRANELEIRO;
    int maxPessoa;
    int maxCarga;
    
    public synchronized  void setVal(int carga, int pessoa){
        maxPessoa = pessoa;
        maxCarga = carga;
    }
}
