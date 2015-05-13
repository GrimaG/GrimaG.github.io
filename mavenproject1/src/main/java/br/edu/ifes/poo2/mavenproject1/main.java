/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.mavenproject1;

import java.io.IOException;

/**
 *
 * @author Gustavo
 */
public class main {
     public static void main(String[] args) {
        System.out.println("using traditional singleton");
        SerialNumberGeneratorTraditional generator = SerialNumberGeneratorTraditional.getInstance();
        System.out.println("next5Serial"+ generator.getNextSerial());
        System.out.println("next5Serial"+ generator.getNextSerial());
        
        
    }
    
}
