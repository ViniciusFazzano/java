/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.mycompany.clinicaodonto.dto.ConsultaDTO;
import com.mycompany.clinicaodonto.dto.DTO;
import entidades.Consulta;
import java.util.List;
import org.json.JSONObject;
import percistencia.consulta.ConsultaDao;
import percistencia.consulta.ConsultaImpl;

/**
 *
 * @author Beatriz
 */
public class ConsultasController implements Controller{

    ConsultaDao dao = new ConsultaImpl();
    
    @Override
    public void salva(DTO dto) throws Exception {
        dao.atualiza(dto.builder());
    }

    @Override
    public void remover(DTO dto) {
        dao.remove(((ConsultaDTO) dto).builder());
    }

    @Override
    public Object[] getDados(DTO o) {
        ConsultaDTO dto = (ConsultaDTO) o;
        return new Object[]{dto.id, dto.nomePaciente, dto.obs, dto.anexos, dto.nomeDentista, dto.pagamento};
    }
    
    @Override
    public String[] getTitulosColunas() {
        return new String[]{"id", "Nome do Paciente", "Observacoes", "Anexos", "Dentista", "Froma de pagamento"};
    }
    
    @Override
    public List getListaDados() {
        List<Consulta> dados = dao.listar(Consulta.class);
        ConsultaDTO consultaDTO = new ConsultaDTO();
        return  consultaDTO.getListaDados(dados);
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
    public Object[] getDados(JSONObject func) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean verificaExiste(JSONObject func) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
