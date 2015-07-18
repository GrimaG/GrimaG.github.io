package br.edu.ifes.poo2.ir;


public class Tipo5 implements IR{
	private double aliquota;
	private double valor;
	
	public Tipo5(){
		this.aliquota=27.5;
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
