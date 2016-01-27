package br.edu.ifes.poo2.maquina_goma;


public class GomasAcabaram implements ControllerState{
	private Controller controller;
	
	
	public GomasAcabaram(Controller c){
		this.controller=c;
	}
	
	public void next(){
		controller.setEstadoCorrente(null);
	}
	
	public void imprime(){
		System.out.println("Gomas acabaram!");
	}
}
