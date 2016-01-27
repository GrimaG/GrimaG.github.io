package br.edu.ifes.poo2.maquina_goma;


public class Controller {

	
	private ControllerState semMoeda;
	private ControllerState moedaRecebida;
	private ControllerState gomaVendida;
	private ControllerState gomasAcabaram;
	private ControllerState estadocorrente;
	
	public Controller(){
		semMoeda = new SemMoeda(this);
		moedaRecebida =  new MoedaRecebida(this);
		gomaVendida =  new GomaVendida(this);
		gomasAcabaram = new GomasAcabaram(this);
		
		setEstadoCorrente(semMoeda);
	}
	
	public void setEstadoCorrente(ControllerState c){
		this.estadocorrente=c;
	}
	
	public void setProximoEstado(){
		estadocorrente.next();
	}
	
	public ControllerState getSemMoeda(){
		return semMoeda;
	}
	
	public ControllerState getMoedaRecebida(){
		return moedaRecebida;
	}
	
	public ControllerState getGomaVendida(){
		return gomaVendida;
	}
	
	public ControllerState getAcabaramGomas(){
		return gomasAcabaram;
	}
	
	public void imprime(){
		estadocorrente.imprime();
	}

}
