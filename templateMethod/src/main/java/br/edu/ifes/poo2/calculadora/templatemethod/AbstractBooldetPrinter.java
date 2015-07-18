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
public abstract class AbstractBooldetPrinter {
    protected abstract int getPageCount();
    protected abstract void printFrontCover();
    protected abstract void printTableContents();
    protected abstract void printTableOfContents();
    protected abstract void printPage(int pageNumber);
    protected abstract void printIndex();
    protected abstract void printBackCover();
    
    public final void print(){
        printFrontCover();
        printTableOfContents();
        for (int pagenumber =1; pagenumber<= getPageCount(); pagenumber++){
            printPage(pagenumber);
        }
        printIndex();
        printBackCover();
    }
}
