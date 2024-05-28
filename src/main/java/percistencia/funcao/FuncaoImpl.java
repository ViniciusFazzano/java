/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percistencia.funcao;

import java.util.List;
import javax.swing.JOptionPane;
import percistencia.padrao.Dao;
import entidades.Funcao;

/**
 *
 * @author vinic
 */
public class FuncaoImpl implements FuncaoDao {

    public List<Funcao> listar(Object o, String nomeFuncao) {

//            public List listar(Class c, String where) {
//        return em.createQuery("select o from " + c.getSimpleName() + " o where 1=1 " + where)
//                .getResultList();
//    }
        try {
//            Funcao funcao = new Funcao();
            System.out.println("consulta Funcao logo abaixo");
            System.out.println(Dao.getInstace().getEm().createQuery("select o from " + o + " o ").getResultList());
            return Dao.getInstace().getEm().createQuery("select o from " + o + " o ").getResultList();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Usuário não encontrado", "Alerta", JOptionPane.WARNING_MESSAGE);
            return null;
        }
    }

    @Override
    public void salvar(Object entidade) {
        FuncaoDao.super.salvar(entidade); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public List<Funcao> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
