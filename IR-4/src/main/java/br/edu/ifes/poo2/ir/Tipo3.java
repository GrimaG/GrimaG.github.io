package br.edu.ifes.poo2.ir;


public class Tipo3 implements IR {
	private double aliquota;
	private double valor;
	public Tipo3(){
		this.aliquota=15;
	}
	
	public double getAliquota(){
		return this.aliquota;
	}
	
	public double efetuaCalculo(){
		return getValor()*(1+getAliquota()/100);
	}
	
	public void setValor(double c){
		this.valor=c;
	}
	public double getValor(){
		return this.valor;
	}
}
