/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaodonto.dto;

import entidades.Funcionario;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Beatriz
 */
public class FuncionarioDTO extends DTO{
    public String nomeFuncionario;
    public String numeroRegistro;


    @Override
    public Funcionario builder(){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nomeFuncionario);
        funcionario.setId(id!=null?Long.valueOf(id):0l);
        funcionario.setRegistro(numeroRegistro);
        return funcionario;
    }
    
    public List getListaDados(List<Funcionario> dados) {
        List dadosDTO = new LinkedList();
        for (Funcionario dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    private Object converte(Funcionario f) {
        
        FuncionarioDTO dto= new FuncionarioDTO();
        dto.nomeFuncionario=f.getNome();
        dto.id=f.getId().toString();
        dto.numeroRegistro=f.getRegistro();
        return dto;
    }
    
}
