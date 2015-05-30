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
public class FabricaNavio {
    Director director = new Director();
    BuilderNavio builder = new BuilderNavio();
    
    
    private Navio build(Navio navio){
        builder.setNavio(navio);
        return director.build(builder);
    }
    Navio criarNavio(String navio, int pessoas, int carga){//é pra implementar esse metodo?
       Navio ship = null;
       switch (navio){
               case "Cruzeiro":
                   ship = new FabricaCruzeiro().criarNavio(pessoas);
                   ship =build(ship);
               
               case "Escuna":
                   ship = new FabricaEscuna().criarNavio(pessoas);
                   ship =build(ship);
               case "Graneleiro":
                   ship= new FabricaGraneleiro().criarNavio(pessoas, carga);
                   ship =build(ship);
               
               case "Carga":
                   ship= new FabricaCarga().criarNavio(pessoas, carga);
                   ship =build(ship);
        
    }
        return ship;
    }
}
