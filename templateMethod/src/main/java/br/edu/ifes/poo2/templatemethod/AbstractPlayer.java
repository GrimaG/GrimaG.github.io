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
public abstract class AbstractPlayer {
    public abstract void carregarArquivoeLegenda();
    public abstract void  reproduzVideo();
    public abstract void  finalizarReprodução();
    
    public  final boolean rodaPlayer(){
        try{
        carregarArquivoeLegenda();
        reproduzVideo();
        finalizarReprodução();
        return true;
        }catch (Exception ex){
            System.out.println("Erro ao reproduzir");
            return false;
        }
    }
}
