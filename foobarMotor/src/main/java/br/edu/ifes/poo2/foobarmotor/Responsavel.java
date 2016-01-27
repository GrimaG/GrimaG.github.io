package br.edu.ifes.poo2.foobarmotor;

public interface Responsavel extends Expression {
	public void setProximoResponsavel(Responsavel r);
	public void processarPalavra(Comando entrada);
	
}
