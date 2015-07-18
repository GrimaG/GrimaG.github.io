/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.calculadora.templatemethod;

/**
 *
 * @author Gustavo
 */
public class SaloonBooklet extends AbstractBooldetPrinter {

    @Override
    protected int getPageCount() {
        return 100;
    }

    @Override
    protected void printFrontCover() {
        System.out.println("Capa do Saloon");
    }

    @Override
    protected void printTableContents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void printTableOfContents() {
        System.out.println("sumario");
    }//terminar tudo isso

    @Override
    protected void printPage(int pageNumber) {
        System.out.println("Pagina "+pageNumber);
    }

    @Override
    protected void printIndex() {
        System.out.println("Imprimindo index do Saloon");
    }

    @Override
    protected void printBackCover() {
        System.out.println("Imprimindo Capa de tras");
    }
    
}
