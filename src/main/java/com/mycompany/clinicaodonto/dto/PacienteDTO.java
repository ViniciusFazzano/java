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
import percistencia.contato.ContatoDao;
import percistencia.contato.ContatoImpl;
import percistencia.endereco.EnderecoDao;
import percistencia.endereco.EnderecoImpl;
import percistencia.paciente.PacienteDao;
import percistencia.paciente.PacienteImpl;

/**
 *
 * @author Beatriz
 */
public class PacienteDTO extends DTO {

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
        paciente.setId(id != null ? Long.valueOf(id) : 0l);
        paciente.setNome(nomePaciente);
        paciente.setCpf(cpfPaciente);
        paciente.setDataNasc(nascPaciente);
        paciente.setNumCasa(numero);
        EnderecoDao endDao = new EnderecoImpl();
        Endereco end = endDao.existeEnd(endereco);
        if (end == null) {
            end = new Endereco();
            end.setRua(endereco);
            endDao.salvar(end);
            CidadeDao cidDao = new CidadeImpl();
            Cidade cid = cidDao.existeCid(cidade);
            if (cid == null) {
                cid = new Cidade();
                cid.setNome(cidade);
                cid.setEstado(UF.valueOf(estado));
                cidDao.salvar(cid);
            }
            //        end.setCidade_id(cid);
        }
        paciente.setEndereco(end);
//        PacienteDao paciDao = new PacienteImpl();
//        Paciente responsavel = paciDao.existePaci(nomeResponsavel);
//        if (responsavel == null) {
//            responsavel = new Paciente();
//            responsavel.setId(id != null ? Long.valueOf(id) : 0l);
        paciente.setNomeResponsavel(nomeResponsavel);
//            paciDao.salvar(responsavel);
//        }
//        paciente.setResponsavel(responsavel);
        Contato cont = new Contato();
        ContatoDao contDao = new ContatoImpl();
        cont.setInformacao(contato);
        contDao.salvar(cont);
//         cont.setPaciente(paciente);

        //paciente.setContatos((List<Contato>) cont);
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

        PacienteDTO dto = new PacienteDTO();

        dto.id = p.getId() != null ? p.getId().toString() : null;
        dto.nomePaciente = p.getNome();
        dto.cpfPaciente = p.getCpf();
        dto.nascPaciente = p.getDataNasc();
        dto.numero = p.getNumCasa();
        dto.nomeResponsavel = p.getNomeResponsavel();

        if (p.getEndereco() != null) {
            dto.endereco = p.getEndereco().getRua();
            if (p.getEndereco().getRua() != null) {
                dto.estado = p.getEndereco().getRua();
            }
        } else {
            dto.endereco = "Endereço não disponível";
            dto.cidade = "Cidade não disponível";
            dto.estado = "Estado não disponível";
        }
 
        if (p.getContatos() != null && !p.getContatos().isEmpty()) {
            dto.contato = p.getContatos().get(0).getInformacao();
        } else {
            dto.contato = "Contato não disponível";
        }

        return dto;
    }

}
