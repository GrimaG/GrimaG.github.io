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
public abstract class AbstractFactoryCafe {
    public abstract String criarNome();
    public abstract float criarPreco(Dia dia);
    public abstract ArrayList<Ingredientes> criarIngredientes();
    
}
