package br.edu.ifes.poo2.ir;


public class Calculo {
	private FactoryValor valor = new FactoryValor();
	private TiposIR tipo;
	
	public Calculo (double val){
		this.tipo=valor.getValor(val);
		tipo.setValor(val);
	}
	
	public void calculaIR(){
		System.out.println(tipo.efetuaCalculo());
	}
	
}
