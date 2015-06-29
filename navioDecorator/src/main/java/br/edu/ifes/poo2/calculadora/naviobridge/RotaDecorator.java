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
public abstract class RotaDecorator {
    protected Rotas rota;
    public RotaDecorator (Rotas rota){
        this.rota = rota;
    }
}
