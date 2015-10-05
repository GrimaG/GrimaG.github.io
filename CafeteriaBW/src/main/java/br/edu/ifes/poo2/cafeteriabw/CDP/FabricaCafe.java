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

    public Cafe fazerCafe(String tipo, Dia dia) throws Exception {
        AbstractFactoryCafe fabrica = null;
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
            return fabrica.criarCafe(dia);
        } else {
            throw new Exception("café invalido");
        }
    }
}
