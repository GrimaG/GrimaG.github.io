package br.edu.ifes.poo2.arcondicionado;

import java.util.Observable;


public class Sensor extends Observable {

	private int qtdPessoas;
	
	public void setPessoas(int qtd){
		this.qtdPessoas=qtd;
		
		setChanged();
		notifyObservers();
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
	
	

}
