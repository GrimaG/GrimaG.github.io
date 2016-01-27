package br.edu.ifes.poo2.ir;


public class TipoB implements TiposIR {
	private double aliquota;
	private double valor;
	public TipoB(){
		this.aliquota=7.5;
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
