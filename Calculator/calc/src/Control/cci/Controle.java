/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.cci;

import Model.cgt.AplControle;
import View.cih.Input;

/**
 *
 * @author Gustavo
 */
public class Controle {
    Input entrada = new Input();
    AplControle ctrl;

    public Controle() {
        this.ctrl = new AplControle();
        entrada.showVal(ctrl.calculadora(entrada.getVal())); 
    }
    
}
