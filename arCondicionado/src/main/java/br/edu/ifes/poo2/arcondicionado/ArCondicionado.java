package br.edu.ifes.poo2.arcondicionado;

import java.util.Observable;
import java.util.Observer;


public class ArCondicionado implements Observer {

	public static final int  TEMP_PADRAO = 25;
	public double alteracao = 0;
	
	public void update(Observable o, Object arg1) {
		Sensor s = (Sensor) o;
		int q = s.getQtdPessoas();
		alteracao= TEMP_PADRAO - q;
	}

	public double getAlt(){
		return alteracao;
	}
}
