/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.fabricanavios;

/**
 *
 * @author Gustavo
 */
public class FabricaNavio {
    Navio criarNavio(String navio, int pessoas, int carga){//é pra implementar esse metodo?
       Navio ship = null;
       switch (navio){
               case "Cruzeiro":
                   ship = new FabricaCruzeiro().criarNavio(pessoas);
               
               case "Escuna":
                   ship = new FabricaEscuna().criarNavio(pessoas);
               
               case "Graneleiro":
                   ship= new FabricaGraneleiro().criarNavio(pessoas, carga);
               
               case "Carga":
                   ship= new FabricaCarga().criarNavio(pessoas, carga);
        
    }
        return ship;
    }
}
