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
public class ServiceHistoryBooklet  extends AbstractBooldetPrinter{
        @Override
    protected int getPageCount() {
        return 12;
    }

    @Override
    protected void printFrontCover() {
        System.out.println("Capa do Service History Booklet");
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
        System.out.println("Imprimindo index do Service History Booklet");
    }

    @Override
    protected void printBackCover() {
        System.out.println("Imprimindo Capa de tras");
    }
}
