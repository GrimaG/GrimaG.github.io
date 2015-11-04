/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.poo.pizzaria.cdp;
/**
 *
 * @author Gustavo
 */
public class Cozinheiro implements Director {
    public Pizza montarPizza(Builder cozinheiro) {
        Pizza pizza;
        
        cozinheiro.prepararMassa();
        cozinheiro.prepararMolho();
        cozinheiro.prepararRecheio();
        pizza = cozinheiro.colocarForno();
        return pizza;
    }
}
