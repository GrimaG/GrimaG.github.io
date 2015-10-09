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
public class FabricaCafe {
    private static FabricaCafe fabricaCafe;
    
    public synchronized  static  FabricaCafe getInstance(){
        if (fabricaCafe == null){
            fabricaCafe = new FabricaCafe();
        }
        
        return fabricaCafe;
    }
    public Cafe fazerCafe(String tipo, Dia dia) throws Exception {
         AbstractFactoryCafe fabrica = null;
         Cafe cafe = new Cafe();
        if (tipo.equals("normal")) {
            fabrica = new FabricaCafeNormal();
        }

        if (tipo.equals("sem cafeina")) {
            fabrica = new FabricaSemCafeina();
        }

        if (tipo.equals("cappuccino")) {
            fabrica = new FabricaCappuccino();
        }
        if (fabrica != null) {
            cafe.setTipoDeCafe(fabrica.criarNome());
            cafe.setIngredientes(fabrica.criarIngredientes());
            cafe.setValor(fabrica.criarPreco(dia));
            return cafe;
        } else {
            throw new Exception("café invalido");
        }
    }
}
