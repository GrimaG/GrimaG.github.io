/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.consultorio.CDP;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author Gustavo
 */
public class Medico extends AbstractPessoa{
    public String nroCRM;
    private ArrayList<HoraAtendimento> atendimento = new ArrayList<HoraAtendimento>();
    private ArrayList<Especialidade> especialidade = new ArrayList<Especialidade>();
    private ArrayList<PlanoDeSaude> convenio = new ArrayList<PlanoDeSaude>();
    private ArrayList<Consulta> consultas = new ArrayList<Consulta>();

    public String getNroCRM() {
        return nroCRM;
    }

    public void setNroCRM(String nroCRM) {
        this.nroCRM = nroCRM;
    }

    public ArrayList<HoraAtendimento> getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(HoraAtendimento atendimento) {
        this.atendimento.add(atendimento);
    }

    public ArrayList<Especialidade> getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade.add(especialidade);
    }

    public ArrayList<PlanoDeSaude> getConvenio() {
        return convenio;
    }

    public void setConvenio(PlanoDeSaude convenio) {
        this.convenio.add(convenio);
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public boolean agendarConsultas(Calendar dia, String Plano, String hora, String min) {
         Consulta consulta = new Consulta();
        for (Consulta consultar: consultas){
            if (consultar.getDataHora() == dia)
                if (consultar.getHora().equals(hora))
                    if (!consultar.equals(min)) {
                       consulta.setDataHora(dia);
                       consulta.setHora(hora);
                       consulta.setMin(min);
                       consulta.setPlano(Plano);
                       this.consultas.add(consulta);
                       return true;
                    }
        }
        return false;
        
    }
    
    @Override
    public void salvar()  {
        try{
            System.out.println("Salvou, eba, parabens");
        }
        catch (Exception e){
            System.out.println("Deu merda");
        }
    }

    
    @Override
    public void modificar(AbstractPessoa pessoa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
