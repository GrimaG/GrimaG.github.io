package br.edu.ifes.poo2.comando3;


public class UndoPortao implements Comando{

	public void execute(){
		new Portao().fecharPortao();
	}

}
