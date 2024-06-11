/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percistencia.endereco;

import entidades.Endereco;
import java.util.List;
import percistencia.padrao.Dao;

/**
 *
 * @author Beatriz
 */
public class EnderecoImpl implements EnderecoDao{

    @Override
    public Endereco existeEnd(String nome) {
        List<Endereco> resultList = Dao.getInstace().getEm().createNativeQuery(
                "select * from endereco where rua=?",Endereco.class)
                .setParameter(1, nome).getResultList();
        return !resultList.isEmpty()?resultList.get(0):null;
    }
    
}
