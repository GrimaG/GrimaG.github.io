package br.edu.ifes.poo2.comando3;


public class DoCarro implements Comando {

	public void execute(){
		new Carro().ligarCarro();
	}

}
