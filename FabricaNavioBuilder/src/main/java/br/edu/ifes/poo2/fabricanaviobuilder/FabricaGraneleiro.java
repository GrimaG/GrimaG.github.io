/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.fabricanaviobuilder;

/**
 *
 * @author Gustavo
 */
public class FabricaGraneleiro extends FactoryNavioCarga {

    @Override
    public Navio criarNavio(int qtdPessoa, int QtdCarga) {
        Navio navio;
        navio = new Graneleiro();
        return navio;
    }
    
}
