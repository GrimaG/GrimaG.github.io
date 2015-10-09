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
public class Cafe {
    private ArrayList<Ingredientes> ingredientes = new ArrayList<Ingredientes>();
    private String tipoDeCafe;
    private float valor;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void getInformacao() {
        System.out.println(tipoDeCafe+ " = RS "+ getValor());
        for (Ingredientes ingrediente: ingredientes)
            System.out.println(ingrediente.getNome()+ " qtd = "+ ingrediente.getQuantidade());
    }

    public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getTipoDeCafe() {
        return tipoDeCafe;
    }

    public void setTipoDeCafe(String tipoDeCafe) {
        this.tipoDeCafe = tipoDeCafe;
    }

    public ArrayList<Ingredientes> printIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingredientes ingredientes) {
        this.ingredientes.add(ingredientes);
    }
    
}
