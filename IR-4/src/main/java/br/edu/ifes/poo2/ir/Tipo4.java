package br.edu.ifes.poo2.ir;


public class Tipo4 implements IR{
	private double aliquota;
	private double valor;
	
	public Tipo4(){
		this.aliquota=22.5;
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
