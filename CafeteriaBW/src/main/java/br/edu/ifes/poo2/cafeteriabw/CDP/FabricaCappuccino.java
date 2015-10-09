/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cafeteriabw.CDP;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class FabricaCappuccino extends AbstractFactoryCafe {

    @Override
    public String criarNome() {
        return "Cafe Cappuccino";
    }

    @Override
    public float criarPreco(Dia dia) {
        if (dia == Dia.SEGUNDA || dia == Dia.QUARTA || dia == Dia.SEXTA) {
            return 5 / 2;
        } else {
            return 5;
        }
    }

    @Override
    public ArrayList<Ingredientes> criarIngredientes() {
        ArrayList<Ingredientes> ingredientes = new ArrayList<Ingredientes>();
        
        FabricaIngredientes ingrediente = new FabricaIngredientes();
        
        
        
        ingredientes.add(ingrediente.prepararIngrediente("CAFESOLUVEL","100g"));
        ingredientes.add(ingrediente.prepararIngrediente("ACUCAR","200g"));
        ingredientes.add(ingrediente.prepararIngrediente("LEITEPO","100g"));
        ingredientes.add(ingrediente.prepararIngrediente("CANELA","1g"));
        ingredientes.add(ingrediente.prepararIngrediente("AGUA","100 ml"));

        return ingredientes;
    }

}
