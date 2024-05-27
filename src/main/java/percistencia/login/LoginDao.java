/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percistencia.login;

import entidades.Login;
import java.util.List;
import percistencia.padrao.Dao;
import percistencia.padrao.InterfaceDao;

/**
 *
 * @author vinic
 */
public interface LoginDao extends InterfaceDao {

    public List<Login> listar();

    @Override
    public default void salvar(Object entidade) {
        Dao.getInstace().salvar(entidade);
    }
}
