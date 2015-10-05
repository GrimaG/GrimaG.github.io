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
public class FabricaCappuccino extends AbstractFactoryCafe {

    @Override
    public Cafe criarCafe(Dia dia) {
        Cafe cafe = new Cafe();
        Ingredientes ingrediente;
        if (dia== Dia.SEGUNDA || dia== Dia.QUARTA || dia== Dia.SEXTA )
            cafe.setValor(5/2);
        else cafe.setValor(5);
        cafe.setTipoDeCafe("Cafe Cappuccino");
        ingrediente = Ingredientes.CAFESOLUVEL;
        ingrediente.setQuantidade("100g");
        cafe.setIngredientes(ingrediente);
        
        ingrediente = Ingredientes.ACUCAR;
        ingrediente.setQuantidade("200g");
        cafe.setIngredientes(ingrediente);
        
        ingrediente = Ingredientes.LEITEPO;
        ingrediente.setQuantidade("100 ml");
        cafe.setIngredientes(ingrediente);
        
        ingrediente = Ingredientes.CANELA;
        ingrediente.setQuantidade("1g");
        cafe.setIngredientes(ingrediente);
        
         ingrediente = Ingredientes.CANELA;
        ingrediente.setQuantidade("1g");
        cafe.setIngredientes(ingrediente);
        
         ingrediente = Ingredientes.AGUA;
        ingrediente.setQuantidade("100 ml");
        cafe.setIngredientes(ingrediente);
        
        return cafe;
        
    }
    
}
