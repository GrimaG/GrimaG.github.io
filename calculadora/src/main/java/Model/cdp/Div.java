/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.cdp;

import Model.cdp.Operador;

/**
 *
 * @author Gustavo
 */
public class Div implements Operador{
    @Override
    public float calcula(float value, float numb) {
        if (numb==0){
            System.out.println("Cannot divide by 0");
            return 0;
        }
        else
        return value/numb;
    
    }
}
