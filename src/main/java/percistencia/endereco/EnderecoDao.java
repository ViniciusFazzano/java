/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package percistencia.endereco;

import entidades.Endereco;
import percistencia.padrao.InterfaceDao;

/**
 *
 * @author Beatriz
 */
public interface EnderecoDao extends InterfaceDao{
    public Endereco existeEnd (String nome);
    
}
