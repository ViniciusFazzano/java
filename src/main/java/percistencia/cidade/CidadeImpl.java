/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percistencia.cidade;

import entidades.Cidade;
import percistencia.padrao.Dao;

/**
 *
 * @author Beatriz
 */
public class CidadeImpl implements CidadeDao{

    @Override
    public Cidade existeCid(String nome) {
        return  (Cidade) Dao.getInstace().getEm().createNativeQuery(
                 "select * from Cidade where nome=:nome",Cidade.class)
                .setParameter("nome",nome).getSingleResult();
    }
    
}
