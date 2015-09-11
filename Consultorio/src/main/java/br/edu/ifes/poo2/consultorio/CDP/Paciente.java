/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.consultorio.CDP;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class Paciente extends AbstractPessoa {

    private String dtNascimento;
    private String profissao;
    private ArrayList<Observacao> observacoes;

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public ArrayList<Observacao> getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(Observacao observacoes) {
        this.observacoes.add(observacoes);
    }

    @Override
    public void salvar() {
        try {
            System.out.println("Salvou, eba, parabens");
        } catch (Exception e) {
            System.out.println("Deu merda");
        }
    }

    @Override
    public void modificar(AbstractPessoa pessoa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
