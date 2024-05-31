/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package percistencia.consulta;

import entidades.Paciente;
import java.util.List;
import percistencia.padrao.InterfaceDao;

/**
 *
 * @author Beatriz
 */
public interface ConsultaDao extends InterfaceDao{
    public  List listarbyPaciente(String nome);
}
