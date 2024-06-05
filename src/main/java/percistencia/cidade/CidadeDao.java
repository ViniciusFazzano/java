/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package percistencia.cidade;

import entidades.Cidade;
import percistencia.padrao.InterfaceDao;

/**
 *
 * @author Beatriz
 */
public interface CidadeDao extends InterfaceDao{
    public Cidade existeCid(String nome);
}
