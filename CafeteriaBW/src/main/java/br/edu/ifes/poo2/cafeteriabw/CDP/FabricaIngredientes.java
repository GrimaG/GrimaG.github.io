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
public class FabricaIngredientes {
        
    public Ingredientes prepararIngrediente(String nome, String quantidade){
        Ingredientes ingrediente = null;
        if (nome.equals("CAFESOLUVEL"))
            ingrediente = new Ingredientes("Cafe Soluvel", quantidade);
        if (nome.equals("CAFEDESCAFEINADO"))
            ingrediente =  new Ingredientes("Café descafeinado", quantidade);
        if (nome.equals("ACUCAR"))
            ingrediente =  new Ingredientes("Açúcar", quantidade);
        if (nome.equals("LEITE"))
            ingrediente =  new Ingredientes("Diaheia", quantidade);
        if (nome.equals("BICARBONATO"))
            ingrediente =  new Ingredientes("Bicarbonato", quantidade);
        if (nome.equals("CHOCOLATE"))
            ingrediente =  new Ingredientes("Chocolate", quantidade);
        if (nome.equals("CANELA"))
            ingrediente =  new Ingredientes("Canela", quantidade);
        if (nome.equals("LEITEPO"))
            ingrediente =  new Ingredientes("Leite em pó", quantidade);
        if (nome.equals("AGUA"))
            ingrediente =  new Ingredientes("Água", quantidade);
        return ingrediente;
    }
}
