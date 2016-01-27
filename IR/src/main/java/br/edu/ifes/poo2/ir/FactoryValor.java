package br.edu.ifes.poo2.ir;

         
public  class FactoryValor {
	
	private TiposIR tipo;
	
	public TiposIR getValor(double valor){
		if(valor<1710.78) tipo= new TipoA();
		else if(valor<2563.91 && valor>=1710.78) tipo=new TipoB();
		else if(valor>=2563.91 && valor<3418.59) tipo= new TipoC();
		else if(valor>=3418.59 && valor<4271.59) tipo= new TipoD();
		else tipo= new TipoE();
		
		return tipo;
	}
	
	
	
}
