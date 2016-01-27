package br.edu.ifes.poo2.arcondicionado;


public class Principal {


	public static void main(String[] args) {
	
		Sensor sensor = new Sensor();
		ArCondicionado ar = new ArCondicionado();
		sensor.addObserver(ar);
		sensor.setPessoas(30);
		System.out.println(ar.getAlt());
		

	}

}
