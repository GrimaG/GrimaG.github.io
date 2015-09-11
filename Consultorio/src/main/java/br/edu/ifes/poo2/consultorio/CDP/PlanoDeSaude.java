/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.consultorio.CDP;

/**
 *
 * @author Gustavo
 */
public class PlanoDeSaude {
    private String rasaoSocial;
    private String cdCNPJ;
    private String endereco;
    private String telefone;

    public String getRasaoSocial() {
        return rasaoSocial;
    }

    public void setRasaoSocial(String rasaoSocial) {
        this.rasaoSocial = rasaoSocial;
    }

    public String getCdCNPJ() {
        return cdCNPJ;
    }

    public void setCdCNPJ(String cdCNPJ) {
        this.cdCNPJ = cdCNPJ;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
