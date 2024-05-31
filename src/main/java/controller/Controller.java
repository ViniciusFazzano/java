/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.mycompany.clinicaodonto.dto.DTO;
import java.util.List;
import org.json.JSONObject;

/**
 *
 * @author vinic
 */

public interface Controller {

    public String[] getTitulosColunas();//colunas matriz

    public Object[] getDados(JSONObject func);//array matriz

    public List getListaDados();//lista de dados 

    public void remover(JSONObject func);

    public void salvar(JSONObject func) throws Exception;

    public void salvaDTO (DTO dto) throws Exception;
    
    public void removerDTO (DTO dto);
    
    public Object[] getDadosDTO(DTO dto);//array matriz
}
