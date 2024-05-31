/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaodonto.dto;

import entidades.Materiais;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Beatriz
 */
public class MateriaisDTO extends DTO{
    public String nome;
    public Integer qtd;
    

    @Override
    public Object builder() {
        Materiais material = new Materiais();
        material.setId(id!=null?Long.valueOf(id):0l);
        material.setNome(nome);
        material.setQtd(qtd);
        return material;
    }
    
    
    public List getListaDados(List<Materiais> dados) {
        List dadosDTO = new LinkedList();
        for (Materiais dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    private Object converte(Materiais m) {
        
        MateriaisDTO dto= new MateriaisDTO();
        
        dto.id=m.getId().toString();
        dto.nome=m.getNome();
        dto.qtd=m.getQtd();        
        return dto;
    }
}
