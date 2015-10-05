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
public class FabricaCafeNormal extends AbstractFactoryCafe{

    @Override
    public Cafe criarCafe(Dia dia) {
        Cafe cafe = new Cafe();
        Ingredientes ingrediente;
        if (dia== Dia.SEGUNDA || dia== Dia.QUARTA || dia== Dia.SEXTA )
            cafe.setValor(2/2);
        else cafe.setValor(2);
        cafe.setTipoDeCafe("Cafe Normal");
        ingrediente = Ingredientes.CAFESOLUVEL;
        ingrediente.setQuantidade("50g");
        cafe.setIngredientes(ingrediente);
        
        ingrediente = Ingredientes.ACUCAR;
        ingrediente.setQuantidade("2 xícaras");
        cafe.setIngredientes(ingrediente);
        
        ingrediente = Ingredientes.LEITE;
        ingrediente.setQuantidade("100 ml");
        cafe.setIngredientes(ingrediente);
        
         ingrediente = Ingredientes.AGUA;
        ingrediente.setQuantidade("100 ml");
        cafe.setIngredientes(ingrediente);
        
        return cafe;
            }
    
}
