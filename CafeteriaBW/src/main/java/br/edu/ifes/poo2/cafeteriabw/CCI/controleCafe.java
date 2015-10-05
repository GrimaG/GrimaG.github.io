/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cafeteriabw.CCI;

import br.edu.ifes.poo2.cafeteriabw.CDP.Cafe;
import br.edu.ifes.poo2.cafeteriabw.CDP.Dia;
import br.edu.ifes.poo2.cafeteriabw.CGT.APLFazerCafe;

/**
 *
 * @author Gustavo
 */
public class controleCafe {
    APLFazerCafe controleCafe = new APLFazerCafe();
    Cafe cafe ;
    public Cafe controlaCafe(Dia dia, String TipoCafe) throws Exception{
         cafe =controleCafe.criarCafe(TipoCafe, dia);
        return cafe;
    }
    
}
