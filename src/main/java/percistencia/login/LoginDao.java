/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percistencia.login;

import entidades.Login;
import java.util.List;
import org.json.JSONObject;
import percistencia.padrao.Dao;
import percistencia.padrao.InterfaceDao;

/**
 *
 * @author vinic
 */
public interface LoginDao extends InterfaceDao {

    public List<Login> listar();

    public void salvar(Object entidade) ;
    
    public boolean verificaExiste(JSONObject entidade);
}
