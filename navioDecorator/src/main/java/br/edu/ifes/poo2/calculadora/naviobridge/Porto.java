/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.calculadora.naviobridge;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class Porto {
    private ArrayList<Navio> navios;

    /**
     * @return the navios
     */
    public ArrayList<Navio> getNavios() {
        return navios;
    }

    /**
     * @param navios the navios to set
     */
    public void setNavios(Navio navios) {
        this.navios.add(navios);
    }
}
