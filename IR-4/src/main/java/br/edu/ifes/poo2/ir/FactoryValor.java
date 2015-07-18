package br.edu.ifes.poo2.ir;


public  class FactoryValor {
	
	private IR tipo;
	
	public IR getValor(double valor){
		if(valor<1710.78) tipo= new Tipo1();
		else if(valor<2563.91 && valor>=1710.78) tipo=new Tipo2();
		else if(valor>=2563.91 && valor<3418.59) tipo= new Tipo3();
		else if(valor>=3418.59 && valor<4271.59) tipo= new Tipo4();
		else tipo= new Tipo5();
		
		return tipo;
	}
	
	
	
}
