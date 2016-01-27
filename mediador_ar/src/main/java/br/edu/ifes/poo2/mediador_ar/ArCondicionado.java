package br.edu.ifes.poo2.mediador_ar;


public class ArCondicionado {
	private static final int TEMP_MEDIA=25;
	private Mediador mediador;
	
	public ArCondicionado(Mediador m){
		this.mediador=m;
	}
	
	
	public void ajustaTemperatura(){
		int interno=0,externo=0;
		double resultado;
		for(Sensor i: mediador.getSensoresInternos()){
			interno+=i.getQtdPessoas();
		}
		for(Sensor j: mediador.getSensoresExternos()){
			externo+=j.getTemperaturaExterna();
		}
		resultado=TEMP_MEDIA-((interno/mediador.getSensoresInternos().size())+(externo/mediador.getSensoresExternos().size()));
		System.out.println(resultado);
	}
}
	
	

