/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades.persistencia.materiais;

import entidades.Materiais;
import java.util.List;
import percistencia.padrao.Dao;

/**
 *
 * @author Beatriz
 */
public class MateriaisImpl implements MateriaisDao{

    @Override
    public List listarbyNome(String nome) {
        return Dao.getInstace().getEm().createNativeQuery(
                 "select * from materiais where nome like '% :? %'",Materiais.class)
                .setParameter(1,nome).getResultList();}
    
}
