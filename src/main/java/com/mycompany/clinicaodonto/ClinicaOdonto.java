/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.clinicaodonto;

import controller.ConsultasController;
import controller.FuncaoController;
import controller.MateriaisController;
import controller.PacienteController;
import entidades.Paciente;
import percistencia.padrao.Dao;
import view.Login;
import view.cadastro.Cadastro;
import view.cadastro.CadastroConsulta;
import view.cadastro.CadastroFuncionario;
import view.cadastro.CadastroMateriais;
import view.cadastro.CadastroPaciente;

/**
 *
 * @author Beatriz
 */
public class ClinicaOdonto {

    public static void main(String[] args) {
//        Dao.getInstace().listar(Paciente.class, "");
//        new Cadastro(null, true, new CadastroConsulta(), new ConsultasController()).setVisible(true);
         Login.main(args);
    }
}
