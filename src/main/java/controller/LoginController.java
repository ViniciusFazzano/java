/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.mycompany.clinicaodonto.dto.DTO;
import entidades.Funcao;
import org.json.JSONObject;
import java.util.List;
import percistencia.login.LoginDao;
import percistencia.login.LoginImpl;
import lombok.Data;
import entidades.Login;

/**
 *
 * @author vinic
 */
@Data
public class LoginController implements Controller {

    LoginDao dao = new LoginImpl();

    @Override
    public void salvar(JSONObject func) throws Exception {
        dao.salvar(builderJSOn(func));
    }

    @Override
    public boolean verificaExiste(JSONObject func) throws Exception {
        return dao.verificaExiste(func);
    }

    private Object builderJSOn(JSONObject func) {
        Login login = new Login();
        login.setSenha(func.get("pass").toString());
        login.setUsuario(func.get("nomelogin").toString());
        login.setFuncao((int) func.get("tipoUsuario"));
        System.out.println(login);
        return login;
    }

    @Override
    public String[] getTitulosColunas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object[] getDados(JSONObject func) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List getListaDados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remover(JSONObject func) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void salva(DTO dto) throws Exception {
        dao.salvar(dto.builder());
    }

    @Override
    public void remover(DTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object[] getDados(DTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
