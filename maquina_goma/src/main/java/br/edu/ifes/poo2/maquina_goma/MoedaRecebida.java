package br.edu.ifes.poo2.maquina_goma;


public class MoedaRecebida implements ControllerState {

	private Controller controller;

	public MoedaRecebida(Controller c){
		this.controller=c;
	}
	
	public void next(){
		controller.setEstadoCorrente(controller.getGomaVendida());
	}
	
	public void imprime(){
		System.out.println("Moeda recebida!");
	}
}
