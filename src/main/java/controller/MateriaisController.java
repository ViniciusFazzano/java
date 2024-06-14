/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.mycompany.clinicaodonto.dto.DTO;
import com.mycompany.clinicaodonto.dto.MateriaisDTO;
import entidades.Materiais;
import entidades.persistencia.materiais.MateriaisDao;
import entidades.persistencia.materiais.MateriaisImpl;
import java.util.List;
import org.json.JSONObject;

/**
 *
 * @author Beatriz
 */
public class MateriaisController implements Controller {

    MateriaisDao dao = new MateriaisImpl();

    @Override
    public String[] getTitulosColunas() {
        return new String[]{"id", "Nome", "Quantidade"};
    }

    @Override
    public Object[] getDados(DTO o) {
        MateriaisDTO dto = (MateriaisDTO) o;
        return new Object[]{dto.id, dto.nome, dto.qtd};
    }

    @Override
    public List getListaDados() {
        List<Materiais> dados = dao.listar(Materiais.class);
        MateriaisDTO materiaisDTO = new MateriaisDTO();
        return materiaisDTO.getListaDados(dados);
    }

    @Override
    public void salva(DTO dto) throws Exception {
        dao.atualiza(dto.builder());
    }

    @Override
    public void remover(DTO dto) {
//        dao.remove(((MateriaisDTO) dto).builder());
        dao.remove(Long.valueOf(dto.id), Materiais.class);
    }

    @Override
    public Object[] getDados(JSONObject func) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
