/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percistenciaPaciente;

import entidades.Paciente;
import java.util.List;
import percistencia.padrao.Dao;

/**
 *
 * @author Beatriz
 */
public class PacienteImpl implements PacienteDao {

    @Override
    public List listarbyNome(String nome) {
        return Dao.getInstace().getEm().createNativeQuery(
                "select * from paciente where nome like '% :? %'", Paciente.class)
                .setParameter(1, nome).getResultList();
    }

    @Override
    public Paciente existePaci(String nome) {
        return (Paciente) Dao.getInstace().getEm().createNativeQuery(
                 "select * from Paciente where nome",Paciente.class)
                .setParameter("nome",nome).getSingleResult();}

}
