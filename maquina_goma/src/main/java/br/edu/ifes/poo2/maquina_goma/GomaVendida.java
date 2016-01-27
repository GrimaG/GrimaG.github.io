package br.edu.ifes.poo2.maquina_goma;


public class GomaVendida implements ControllerState {

	private Controller controller;
	
	public GomaVendida(Controller c){
		this.controller=c;
	}
	
	
	public void next(){
		controller.setEstadoCorrente(controller.getSemMoeda());
	}
	
	public void imprime(){
		System.out.println("Goma vendida!");
	}
}

