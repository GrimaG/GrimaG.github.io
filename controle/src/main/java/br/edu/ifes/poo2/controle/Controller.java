package br.edu.ifes.poo2.controle;


public class Controller {

	private Comando DO;
	private Comando UNDO;
	
	public void setComandos(Comando d, Comando u){
		this.DO=d;
		this.UNDO=u;
	}
	
	public void ExecutaDo(){
		DO.execute();
	}
	
	public void ExecutaUNDO(){
		UNDO.execute();
	}

}
