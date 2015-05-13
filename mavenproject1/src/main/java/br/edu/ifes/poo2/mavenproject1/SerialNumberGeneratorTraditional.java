/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.mavenproject1;

/**
 *
 * @author Gustavo
 */
public class SerialNumberGeneratorTraditional {
    private static SerialNumberGeneratorTraditional instance;
    public synchronized static SerialNumberGeneratorTraditional getInstance(){
        if (instance==null){
            instance = new SerialNumberGeneratorTraditional();
        }
        return instance;
    }
    //instance variables
    private int count;
    //private construtor
    private SerialNumberGeneratorTraditional(){}
    
    //instance methods
    public synchronized int getNextSerial(){
    return count ++;
}
    
}
