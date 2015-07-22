/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.templatemethod;

/**
 *
 * @author Gustavo
 */
public class main {
    public static void main(String[] args){
        AbstractPlayer player;
        player = new MP3();
        player.rodaPlayer();
        player = new MP4();
        player.rodaPlayer();
        player = new AVI();
        player.rodaPlayer();
    }
}
