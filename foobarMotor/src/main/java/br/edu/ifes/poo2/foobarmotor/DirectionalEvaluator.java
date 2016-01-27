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

public class DirectionalEvaluator {
    
    private Map<String, City> cities;
    //private ResponsavelImp responsavel;
    public DirectionalEvaluator() {
    	//System.out.println("123");
        cities = new HashMap<String, City>();
        
        cities.put("aberdeen",
                new City("Aberdeen", 57.15, -2.15));
        cities.put("belfast",
                new City("Belfast", 54.62, -5.93));
        cities.put("birmingham",
                new City("Birmingham", 52.42, -1.92));
        cities.put("dublin",
                new City("Dublin", 53.33, -6.25));
        cities.put("edinburgh",
                new City("Edinburgh", 55.92, -3.02));
        cities.put("glasgow",
                new City("Glasgow", 55.83, -4.25));
        cities.put("london",
                new City("London", 51.53, -0.08));
        cities.put("liverpool",
                new City("Liverpool", 53.42, -3.0));
        cities.put("manchester",
                new City("Manchester", 53.5, -2.25));
        cities.put("southampton",
                new City("Southampton", 50.9, -1.38));
    }
    
    public void evaluate(String route) {
        // Define the syntax tree
        Stack<Expression> expressionStack = new Stack<Expression>();
        Comando comando=new Comando();
        // Parse each token in route string
        for (String token : route.split(" ")) {
            // Is token a recognised city?
            if (cities.containsKey(token)) {
                City city = cities.get(token);
                expressionStack.push(new CityExpression(city));
            
            // Is token to find most northerly?
            } 
            else comando.setDirecao(token);
        }
        
       ResponsavelImp.setResponsaveis(comando,loadExpressions(expressionStack));
        
       
       // return expressionStack.pop().interpret();
    }
    
    private List<Expression> loadExpressions(Stack<Expression> expressionStack) {
        List<Expression> expressions =
                new ArrayList<Expression>();
        while(! expressionStack.empty()) {
            expressions.add(expressionStack.pop());
        }
        return expressions;
    }
    
}
