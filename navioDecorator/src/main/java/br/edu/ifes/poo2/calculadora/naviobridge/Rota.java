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
public class Rota implements Rotas{
    private Porto portos;
    private String cidade1;
    private String cidade2;
    private float distancia;
    //private TipoRota rota;

    /**
     * @return the portos
     */
    public Porto getPortos() {
        return portos;
    }

    /**
     * @param portos the portos to set
     */
    public void setPortos(Porto portos) {
        this.portos = portos;
    }

    /**
     * @return the cidade1
     */
    public String getCidade1() {
        return cidade1;
    }

    /**
     * @param cidade1 the cidade1 to set
     */
    public void setCidade1(String cidade1) {
        this.cidade1 = cidade1;
    }

    /**
     * @return the cidade2
     */
    public String getCidade2() {
        return cidade2;
    }

    /**
     * @param cidade2 the cidade2 to set
     */
    public void setCidade2(String cidade2) {
        this.cidade2 = cidade2;
    }

    /**
     * @return the distancia
     */
    public float getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    /**
     * @return the rota
     */
//    public TipoRota getRota() {
//        return rota;
//    }
//
//    /**
//     * @param rota the rota to set
//     */
//    public void setRota(TipoRota rota) {
//        this.rota = rota;
//    }
    
}
