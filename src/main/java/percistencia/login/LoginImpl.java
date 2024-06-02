/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percistencia.login;

import entidades.Login;
import java.util.List;
import javax.persistence.PersistenceException;
import org.json.JSONObject;
import percistencia.padrao.Dao;

/**
 *
 * @author vinic
 */
public class LoginImpl implements LoginDao {

    @Override
    public List<Login> listar() {
        try {
            return Dao.getInstace().getEm().createQuery("SELECT l FROM Login l").getResultList();
        } catch (PersistenceException e) {
            System.err.println("Erro ao listar usuários: " + e.getMessage());
            return null; // Ou lançar a exceção novamente após tratamento ou retornar uma lista vazia
        }
    }

    public boolean verificaExiste(JSONObject entidade) {
        try {
            Long count = (Long) Dao.getInstace().getEm()
                    .createQuery("SELECT COUNT(l) FROM Login l WHERE l.usuario = :usuario AND  l.senha = :senha AND  l.funcao = :funcao")
                    .setParameter("usuario", entidade.get("nomelogin").toString())
                    .setParameter("senha", entidade.get("pass").toString())
                    .setParameter("funcao", entidade.get("tipoUsuario"))
                    .getSingleResult();
            return count > 0;
        } catch (Exception e) {
            System.err.println("Erro ao verificar existência: " + e.getMessage());
            return false;
        }
    }

    @Override
    public void salvar(Object entidade) {
        Dao.getInstace().salvar(entidade);
    }

}
