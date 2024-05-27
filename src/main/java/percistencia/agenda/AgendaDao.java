/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percistencia.agenda;

import entidades.Paciente;
import java.util.List;
import percistencia.padrao.InterfaceDao;

/**
 *
 * @author vinic
 */
public interface AgendaDao extends InterfaceDao {

    public List<Paciente> listar();
}
