package br.edu.ifes.poo2.mediador_ar;

import java.util.ArrayList;


public class Mediador {

	private ArrayList<Sensor> sensoresInternos = new ArrayList<Sensor>(); // trocar para <SensoresInternos>?
	private ArrayList<Sensor> sensoresExternos= new ArrayList<Sensor>();;
	private ArCondicionado arCondicionado;
	
	public void setAr(ArCondicionado a){
		this.arCondicionado=a;
	}
	
	public void RegistraSensoresInternos(Sensor s){
		this.sensoresInternos.add(s);
	}
	
	public void RegistraSensoresExternos(Sensor s){
		this.sensoresExternos.add(s);
	}
	
	public void sensorSetTempExterna(){
			boolean aux=true;
			for(Sensor s:sensoresInternos ){
				if(s.getQtdPessoas()==null){
					aux=false;
				}
			}
			for(Sensor s1: sensoresExternos){
				if(s1.getTemperaturaExterna()==null){
					aux=false;
				}
			}
			if(aux)		
				arCondicionado.ajustaTemperatura();
		
	}
	
	public ArrayList<Sensor> getSensoresInternos() {
		return sensoresInternos;
	}

	

	public ArrayList<Sensor> getSensoresExternos() {
		return sensoresExternos;
	}



	public void sensorSetPessoas(){
		
		boolean aux=true;
		for(Sensor s:sensoresInternos ){
			if(s.getQtdPessoas()==null){
				aux=false;
			}
		}
		for(Sensor s1: sensoresExternos){
			if(s1.getTemperaturaExterna()==null){
				aux=false;
			}
		}
		if(aux)		
			arCondicionado.ajustaTemperatura();
	}
	
	
	
	
	
}
