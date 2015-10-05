/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cafeteriabw.CDP;

/**
 *
 * @author Gustavo
 */
public  enum Ingredientes {
    CAFESOLUVEL, CAFEDESCAFEINADO,ACUCAR, LEITE, BICARBONATO,CHOCOLATE,CANELA,LEITEPO, AGUA;
    
    String quantidade;

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
