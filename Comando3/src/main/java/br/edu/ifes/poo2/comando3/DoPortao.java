package br.edu.ifes.poo2.comando3;


public class DoPortao implements Comando{

	public void execute(){
		new Portao().abrirPortao();
	}

}
