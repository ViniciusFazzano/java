/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percistencia.login;

import entidades.Login;
import java.util.List;
import percistencia.padrao.Dao;

/**
 *
 * @author vinic
 */
public class LoginImpl implements LoginDao {

    @Override
    public List<Login> listar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void salvar(Object entidade) {
        Dao.getInstace().salvar(entidade);
    }

}
