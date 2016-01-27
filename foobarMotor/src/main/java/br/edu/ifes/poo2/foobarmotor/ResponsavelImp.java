package br.edu.ifes.poo2.foobarmotor;

import java.util.List;

public abstract class ResponsavelImp implements Responsavel {
	private Responsavel proximoResponsavel;
	
	public void setProximoResponsavel(Responsavel r){
		this.proximoResponsavel=r;
	}
	
	public static void setResponsaveis(Comando entrada,List<Expression> expressions){
		Responsavel mostEasterlyExpression = new MostEasterlyExpression(expressions);
		Responsavel mostNortherlyExpression = new MostNortherlyExpression(expressions);
		Responsavel mostSoutherlyExpression = new MostSoutherlyExpression(expressions);
		Responsavel mostWesterlyExpression = new MostWesterlyExpression(expressions);
		
		mostEasterlyExpression.setProximoResponsavel(mostNortherlyExpression);
		mostNortherlyExpression.setProximoResponsavel(mostSoutherlyExpression);
		mostSoutherlyExpression.setProximoResponsavel(mostWesterlyExpression);
		
		mostEasterlyExpression.processarPalavra(entrada);
		System.out.println("aqui");
	}
	
	
	
	public abstract City interpret();
	
	public void processarPalavra(Comando entrada){
		boolean palavraEncontrada = false;
		
		if(PalavrasCorrespondente().indexOf(entrada.getDirecao())>=0){
			palavraEncontrada=true;			
		}
		
		if(palavraEncontrada){
			interpret();
		}
		else{
			proximoResponsavel.processarPalavra(entrada);
		}
	}

	protected abstract String PalavrasCorrespondente();
	//protected abstract void processarAqui(String local);
	
	
}
