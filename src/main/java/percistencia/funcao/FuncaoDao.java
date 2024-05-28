/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percistencia.funcao;

import java.util.List;
import percistencia.padrao.Dao;
import percistencia.padrao.InterfaceDao;
import entidades.Funcao;
/**
 *
 * @author vinic
 */
public interface FuncaoDao extends InterfaceDao {

    public List<Funcao> listar();

    @Override
    public default void salvar(Object entidade) {
        Dao.getInstace().salvar(entidade);
    }
}
