
import br.edu.ifes.poo2.cafeteriabwdecorator.Cafe;
import br.edu.ifes.poo2.cafeteriabwdecorator.Chocolate;
import br.edu.ifes.poo2.cafeteriabwdecorator.Icafe;
import br.edu.ifes.poo2.cafeteriabwdecorator.Licor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class Aplication {
    public static void main(String[] args) {
        Icafe cafe = new Cafe();
        cafe = new Chocolate(cafe);
        cafe = new Licor(cafe);
        System.out.println(cafe.getPrice());
    }
    
}
