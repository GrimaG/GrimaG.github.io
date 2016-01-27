package br.edu.ifes.poo2.maquina_goma;


public class SemMoeda implements ControllerState {

	private Controller controller;
	
	public SemMoeda(Controller c){
		this.controller=c;
	}
	
	public void next(){
		controller.setEstadoCorrente(controller.getMoedaRecebida());
	}
	
	public void imprime(){
		System.out.println("Sem moeda!");
	}
}
