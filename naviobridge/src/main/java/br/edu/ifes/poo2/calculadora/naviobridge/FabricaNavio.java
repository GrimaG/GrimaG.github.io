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
public class FabricaNavio {
    AbstractFabricaNavio navioCargueiro =new FabricaCargueiro();
    AbstractFabricaNavio navioGraneleiro = new FabricaGraneleiro();
    AbstractFabricaNavio navioCruzeiro = new FabricaCruzeiro();
    AbstractFabricaNavio navioEscuna = new FabricaEscuna();
    
    public Navio montarNavio(int pessoa, int carga, String tipo){
        
        if (tipo.equals("Cargueiro")){
            return navioCargueiro.criarNavio(pessoa, carga).clone();
        }
        if (tipo.equals("Graneleiro")){
            return navioGraneleiro.criarNavio(pessoa, carga).clone();
        }
        if (tipo.equals("Cruzeiro")){
            return navioCruzeiro.criarNavio(pessoa, carga).clone();
        }
        if (tipo.equals("Escuna")){
            return navioEscuna.criarNavio(pessoa, carga).clone();
        }
        
        
        return null;
        
    }
    
    
    
}
