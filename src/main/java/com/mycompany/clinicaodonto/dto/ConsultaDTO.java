/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaodonto.dto;

import controller.PacienteController;
import entidades.Consulta;
import static entidades.Consulta_.dentista;
import entidades.Funcionario;
import entidades.Paciente;
import java.util.LinkedList;
import java.util.List;
import percistenciaPaciente.PacienteDao;
import percistenciaPaciente.PacienteImpl;
import view.cadastro.Cadastro;
import view.cadastro.CadastroPaciente;

/**
 *
 * @author Beatriz
 */
public class ConsultaDTO extends DTO{
    public String nomePaciente;
    public String obs;
    public String anexos;
    public String nomeDentista;
    public String pagamento;

    @Override
    public Object builder() {
        Consulta consulta = new Consulta();
        consulta.setId(id!=null?Long.valueOf(id):0l);
        PacienteDao paciDao = new PacienteImpl();
        Paciente paci = paciDao.existePaci(nomePaciente);
        if(paci == null){
            new Cadastro(null, true, new CadastroPaciente(), new PacienteController()).setVisible(true);
        }
        consulta.setPaciente(paci);        
        consulta.setObservacao(obs);
        //consulta.setDentista((Funcionario) dentista);
        //consulta.setFormaPagamentos(pagamentos);
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
        
        ConsultaDTO dto= new ConsultaDTO();
        
        dto.id=c.getId().toString();
        //dto.nomePaciente.=c.getPaciente();
        dto.obs= c.getObservacao();
        //dto.nomeDentista=c.getDentista();
        //dto.pagamento=c.getFormaPagamentos();
        
        return dto;
    }
    

}
