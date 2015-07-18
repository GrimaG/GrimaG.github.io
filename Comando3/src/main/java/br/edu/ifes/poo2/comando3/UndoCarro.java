package br.edu.ifes.poo2.comando3;


public class UndoCarro implements Comando {

	public void execute(){
		new Carro().desligarCarro();
	}

}
