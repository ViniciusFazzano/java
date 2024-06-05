/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.clinicaodonto;

import entidades.Paciente;
import percistencia.padrao.Dao;
import view.Login;

/**
 *
 * @author Beatriz
 */
public class ClinicaOdonto {

    public static void main(String[] args) {
       Dao.getInstace().listar(Paciente.class, "");       // new Cadastro(null, true,new CadastroFuncionario(), new FuncaoController()).setVisible(true);
       // Login.main(args);
    }
}
