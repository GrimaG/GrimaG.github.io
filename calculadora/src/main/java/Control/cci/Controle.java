/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.cci;

import Model.cdp.Parse;
import Model.cgt.AplControle;
import View.cih.Input;

/**
 *
 * @author Gustavo
 */
public class Controle {
    Input entrada = new Input();
    AplControle ctrl;
    Parse parse = new Parse();

    public Controle() {
        String polonesa;
        this.ctrl = new AplControle();
        polonesa=parse.parse(entrada.getVal());
        entrada.expressão(polonesa);
        entrada.showVal(ctrl.calculadora(polonesa)); 
    }
    
}
