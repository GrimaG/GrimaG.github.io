


public  class Sensor {
	private Mediador mediador;	
	private Integer temperaturaExterna;
	private Integer qtdPessoas;
	private int id;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Sensor(Mediador m){
		this.mediador=m;
	}
	
	public Integer getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
		mediador.sensorSetPessoas();
                
	}

	public Integer getTemperaturaExterna() {
		return temperaturaExterna;
	}

	public void setTemperaturaExterna(int temperaturaExterna) {
		this.temperaturaExterna = temperaturaExterna;
		mediador.sensorSetTempExterna();//fazer no mediador
	}
	
	
}
