/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percistencia.cidade;

import entidades.Cidade;
import java.util.List;
import percistencia.padrao.Dao;

/**
 *
 * @author Beatriz
 */
public class CidadeImpl implements CidadeDao{

    @Override
    public Cidade existeCid(String nome) {
        List<Cidade> resultList = Dao.getInstace().getEm().createNativeQuery(
                "select * from cidade where nome=?",Cidade.class)
                .setParameter(1, nome).getResultList();
        return !resultList.isEmpty()?resultList.get(0):null;
    }
    
}
