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
import entidades.UF;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import percistencia.cidade.CidadeDao;
import percistencia.cidade.CidadeImpl;
import percistencia.endereco.EnderecoDao;
import percistencia.endereco.EnderecoImpl;
import percistenciaPaciente.PacienteDao;
import percistenciaPaciente.PacienteImpl;

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
         EnderecoDao endDao = new EnderecoImpl();
         Endereco end = endDao.existeEnd(endereco);
         if(end == null){
             end = new Endereco(); 
             end.setRua(endereco);
             endDao.salvar(end);
             CidadeDao cidDao = new CidadeImpl();
             Cidade cid = cidDao.existeCid(cidade);             
             if(cid == null){
                 cid =new Cidade();
                 cid.setNome(cidade);
//                 cid.setEndereco((List<Endereco>) end);
                 cid.setEstado(UF.valueOf(id));
                 cidDao.salvar(cid);
             }
     //        end.setCidade_id(cid);
         }
         paciente.setEndereco_id(end);
         PacienteDao paciDao = new PacienteImpl();
         Paciente responsavel = paciDao.existePaci(nomeResponsavel);
         if(responsavel == null){
             responsavel = new Paciente();
             responsavel.setId(id!=null?Long.valueOf(id):0l);
             responsavel.setNome(nomeResponsavel);
             paciDao.salvar(responsavel);
         }
         paciente.setResponsavel(responsavel);
         Contato cont = new Contato();
         cont.setInformacao(contato);
         cont.setPaciente_id(paciente);
         paciente.setContatos((List<Contato>) cont);
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
        dto.endereco=p.getEndereco_id().getRua();
        dto.nomeResponsavel=p.getResponsavel().getNome();
        dto.contato=p.getContatos().toString();
        
        return dto;
    }
    

    
}
