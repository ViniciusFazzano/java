/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package percistenciaPaciente;

import java.util.List;
import percistencia.padrao.InterfaceDao;

/**
 *
 * @author Beatriz
 */
public interface PacienteDao extends InterfaceDao{
    public  List listarbyNome(String nome);
}
