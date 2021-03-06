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
public class FabricaSemCafeina extends AbstractFactoryCafe {

    @Override
    public String criarNome() {
        return "Cafe Sem Cafeina";
    }

    @Override
    public float criarPreco(Dia dia) {
        if (dia == Dia.SEGUNDA || dia == Dia.QUARTA || dia == Dia.SEXTA) {
            return 3 / 2;
        } else {
            return 3;
        }
    }

    @Override
    public ArrayList<Ingredientes> criarIngredientes() {
        ArrayList<Ingredientes> ingredientes = new ArrayList<Ingredientes>();
        FabricaIngredientes ingrediente = new FabricaIngredientes();
        
        
        
        ingredientes.add(ingrediente.prepararIngrediente("CAFEDESCAFEINADO","50g"));
        ingredientes.add(ingrediente.prepararIngrediente("ACUCAR","2 xícaras"));
        ingredientes.add(ingrediente.prepararIngrediente("LEITE","100 ml"));
        ingredientes.add(ingrediente.prepararIngrediente("AGUA","100 ml"));


        return ingredientes;
    }

}
