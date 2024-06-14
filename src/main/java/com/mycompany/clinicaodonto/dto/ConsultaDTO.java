/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaodonto.dto;

import controller.FuncionarioController;
import controller.PacienteController;
import entidades.Consulta;
import entidades.FormaPagamento;
import entidades.Funcionario;
import entidades.Paciente;
import entidades.TipoPagamento;
import java.util.LinkedList;
import java.util.List;
import percistencia.pagamento.PagamentoDao;
import percistencia.pagamento.PagamentoImpl;
import percistencia.paciente.PacienteDao;
import percistencia.paciente.PacienteImpl;
import persistencia.funcionario.FuncionarioDao;
import persistencia.funcionario.FuncionarioImpl;
import view.cadastro.Cadastro;
import view.cadastro.CadastroFuncionario;
import view.cadastro.CadastroPaciente;

/**
 *
 * @author Beatriz
 */
public class ConsultaDTO extends DTO {

    public String nomePaciente;
    public String obs;
    public String nomeDentista;
    public String valor;
    public String formaPag;

    @Override
    public Object builder() {
        Consulta consulta = new Consulta();
        consulta.setId(id != null ? Long.valueOf(id) : 0l);
        PacienteDao paciDao = new PacienteImpl();
        Paciente paci = paciDao.existePaci(nomePaciente);
        if (paci == null) {
            new Cadastro(null, true, new CadastroPaciente(), new PacienteController()).setVisible(true);
        }
        consulta.setPaciente(paci);
        consulta.setObservacao(obs);
        FuncionarioDao dentDao = new FuncionarioImpl();
        Funcionario dent = dentDao.existePaci(nomeDentista);
        if (dent == null) {
            new Cadastro(null, true, new CadastroFuncionario(), new FuncionarioController()).setVisible(true);
        }
        consulta.setDentista(dent);
        FormaPagamento pag = new FormaPagamento();
        PagamentoDao pagDao = new PagamentoImpl();
        pag.setValor(Double.valueOf(valor));
        pag.setTipo_pagamento(TipoPagamento.valueOf(formaPag));
        pagDao.salvar(pag);
        consulta.setFormaPagamento(pag);
        return consulta;
    }

    public List getListaDados(List<Consulta> dados) {
        List dadosDTO = new LinkedList();
        for (Consulta dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    private Object converte(Consulta c) {

        ConsultaDTO dto = new ConsultaDTO();

        dto.id = c.getId().toString();
        dto.obs = c.getObservacao();
        
        dto.valor = c.getFormaPagamento().getValor().toString();
        dto.formaPag = c.getFormaPagamento().toString();

        if (c.getPaciente() != null) {
            dto.nomePaciente = c.getPaciente().getNome();

        } else {
            dto.nomePaciente = "Passiente nao encontrado";

        }

        if (c.getDentista() != null) {
            dto.nomeDentista = c.getDentista().getNome();

        } else {
            dto.nomeDentista = "Dentista nao encontrado";

        }

        return dto;
    }

}
