/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaodonto.dto;

import entidades.Cidade;
import entidades.Contato;
import entidades.Endereco;
import entidades.Funcionario;
import entidades.Paciente;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Beatriz
 */
public class PacienteDTO extends DTO{
    public String nomePaciente;
    public String cpfPaciente;
    public Date nascPaciente;
    public String numero;
    public String endereco;
    public String cidade;
    public String estado;
    public String nomeResponsavel;
    public String contato;

    @Override
    public Object builder() {
         Paciente paciente = new Paciente();
         paciente.setId(id!=null?Long.valueOf(id):0l);
         paciente.setNome(nomePaciente);
         paciente.setCpf(cpfPaciente);
         paciente.setDataNasc(nascPaciente);
         paciente.setNumCasa(numero);
         //Endereco end = new Endereco();
         //end.setRua(endereco);
         //Cidade cid = new Cidade();
         //cid.setNome(cidade);
         //cid.setEstado(estado);
         Paciente responsavel = new Paciente();
         responsavel.setNome(nomeResponsavel);
         paciente.setResponsavel(responsavel);
         Contato cont = new Contato();
         cont.setInformacao(contato);
         cont.setPaciente_id(paciente);
         return paciente;
    }
    
    public List getListaDados(List<Paciente> dados) {
        List dadosDTO = new LinkedList();
        for (Paciente dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    private Object converte(Paciente p) {
        
        PacienteDTO dto= new PacienteDTO();
        
        dto.id=p.getId().toString();
        dto.nomePaciente=p.getNome();
        dto.cpfPaciente=p.getCpf();
        dto.nascPaciente=p.getDataNasc();
        dto.numero=p.getNumCasa();
        //dto.endereco=p.getEndereco_id()
        //dto.estado
        //dto.nomeResponsavel=p.getResponsavel.toString;
        //dto.contato=p.getContatos();
        
        return dto;
    }
    

    
}
