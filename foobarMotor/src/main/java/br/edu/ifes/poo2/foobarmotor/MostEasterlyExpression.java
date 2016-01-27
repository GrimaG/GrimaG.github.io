/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package br.edu.ifes.poo2.foobarmotor;

import java.util.*;

public class MostEasterlyExpression extends ResponsavelImp  {

    private List<Expression> expressions;
    
      
    public MostEasterlyExpression(List<Expression> expressions){
    	 this.expressions = expressions;
    }
    
    public City interpret() {
    	//System.out.println("procesando no leste");
        City resultingCity = new City("Nowhere", -999.9, -999.9);
        for (Expression currentExpression : expressions) {
            City currentCity = currentExpression.interpret();
            if (currentCity.getLongitude() >
                    resultingCity.getLongitude()) {
                resultingCity = currentCity;
            }
        }
        System.out.println(resultingCity.getName());
        return resultingCity;
    }
    
    protected String PalavrasCorrespondente(){
    	return "leste";
    }
    
    protected void processarAqui(String local){
    	
    }
    
}
