
public class Client {
	public static void main(String a[]){
		Mediador mediador =  new Mediador();
		Sensor sensor1 = new Sensor(mediador);
		Sensor sensor2= new Sensor(mediador);
		Sensor sensor3 = new Sensor(mediador);
		Sensor sensor4 = new Sensor(mediador);
		Sensor sensor5 = new Sensor(mediador);
		Sensor sensor6 = new Sensor(mediador);
		
		ArCondicionado ar = new ArCondicionado(mediador);
		mediador.RegistraSensoresInternos(sensor1);
		mediador.RegistraSensoresInternos(sensor2);
		mediador.RegistraSensoresInternos(sensor3);
		mediador.RegistraSensoresExternos(sensor4);
		mediador.RegistraSensoresExternos(sensor5);
		mediador.RegistraSensoresExternos(sensor6);
		mediador.setAr(ar);
		
		sensor1.setQtdPessoas(10);
		sensor2.setQtdPessoas(10);
		sensor3.setQtdPessoas(10);
		sensor4.setTemperaturaExterna(10);
		sensor5.setTemperaturaExterna(10);
		sensor6.setTemperaturaExterna(10);
		sensor1.setQtdPessoas(40);
	}
}
