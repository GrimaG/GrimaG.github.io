/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.templatemethod;

/**
 *
 * @author Gustavo
 */
public class MP4 extends AbstractPlayer {
        @Override
    public void carregarArquivoeLegenda() {
        System.out.println("Carregando Arquivo e Legenda MP4");
    }

    @Override
    public void reproduzVideo() {
        System.out.println("Reproduzindo");
    }

    @Override
    public void finalizarReprodução() {
        System.out.println("Acabou");
        
    }
}
