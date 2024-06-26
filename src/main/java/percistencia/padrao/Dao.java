/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percistencia.padrao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author vinic
 */
public class Dao {

    private static Dao entidade;
    private final EntityManagerFactory emf;
    private final EntityManager em;

    private Dao() {
        emf = Persistence.createEntityManagerFactory("com.mycompany_ClinicaOdonto_jar_1.0-SNAPSHOTPU");
        em = emf.createEntityManager();

    }

    public static Dao getInstace() {
        if (entidade == null) {
            entidade = new Dao();
        }
        return entidade;
    }

    public EntityManager getEm() {
        return em;
    }

    public Object salvar(Object o) {
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
        return o;
    }

    public Object atualiza(Object o) {
        em.getTransaction().begin();
        Object retorno = em.merge(o);
        em.getTransaction().commit();
        return retorno;
    }

    public void remove(Object o) {
        em.getTransaction().begin();
        System.out.println(o);
        em.remove(o);
        em.getTransaction().commit();
    }


    public List listar(Class c, String where) {
        return em.createQuery("select o from " + c.getSimpleName() + " o where 1=1 " + where)
                .getResultList();
    }

    void remove(Long id, Class clazz) {
        em.getTransaction().begin();
        em.remove(em.find(clazz, id));
        em.getTransaction().commit();    }
}
