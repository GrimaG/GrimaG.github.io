package br.edu.ifes.poo2.ir;


public class Tipo1 implements IR{
	private double aliquota;
	private double valor;
	public Tipo1(){
		this.aliquota=0;
	}
	
	public double getAliquota(){
		return this.aliquota;
	}
	
	public double efetuaCalculo(){
		return getValor();
	}
	public void setValor(double c){
		this.valor=c;
	}
	public double getValor(){
		return this.valor;
	}
}
