package br.edu.ifes.poo2.controle;


public class Principal {

	public static void main(String a[]){
		Controller c = new Controller();
		Comando doCarro = new DoCarro();
		Comando UndoCarro = new UndoCarro();
		c.setComandos(doCarro, UndoCarro);
		c.ExecutaDo();
		c.ExecutaUNDO();
		Comando doPortao = new DoPortao();
		Comando undoPortao = new UndoPortao();
		c.setComandos(doPortao, undoPortao);
		c.ExecutaDo();
		c.ExecutaUNDO();
	}
}
