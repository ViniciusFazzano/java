/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.mycompany.clinicaodonto.dto.DTO;
import com.mycompany.clinicaodonto.dto.FuncionarioDTO;
import entidades.Funcionario;
import java.util.List;
import org.json.JSONObject;
import persistencia.funcionario.FuncionarioDao;
import persistencia.funcionario.FuncionarioImpl;

/**
 *
 * @author Beatriz
 */
public class FuncionarioController implements Controller{

    FuncionarioDao dao = new FuncionarioImpl();
    @Override
    public String[] getTitulosColunas() {
        return new String[]{"id", "Nome"};
    }

    @Override
    public List getListaDados() {
        List<Funcionario> dados = dao.listar(Funcionario.class);
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        return funcionarioDTO.getListaDados(dados);
    }

    @Override
    public void salvaDTO(DTO dto) {
        dao.atualiza(dto.builder());
    }

    @Override
    public void removerDTO(DTO dto) {
        dao.remove(((FuncionarioDTO) dto).builder());
    }

    @Override
    public Object[] getDados(JSONObject func) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public Object[] getDadosDTO(DTO o) {
        FuncionarioDTO dto = (FuncionarioDTO) o;
        return new Object[]{dto.id, dto.nomeFuncionario};
    }
    
    @Override
    public void remover(JSONObject func) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void salvar(JSONObject func) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean verificaExiste(JSONObject func) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
