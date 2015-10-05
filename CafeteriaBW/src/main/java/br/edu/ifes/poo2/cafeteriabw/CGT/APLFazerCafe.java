/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cafeteriabw.CGT;

import br.edu.ifes.poo2.cafeteriabw.CDP.Cafe;
import br.edu.ifes.poo2.cafeteriabw.CDP.Dia;
import br.edu.ifes.poo2.cafeteriabw.CDP.FabricaCafe;

/**
 *
 * @author Gustavo
 */
public class APLFazerCafe {
    Cafe cafe;
    public Cafe criarCafe(String tipoDeCafe, Dia dia) throws Exception{
        cafe = new FabricaCafe().fazerCafe(tipoDeCafe, dia);
        return cafe;
    }

}
