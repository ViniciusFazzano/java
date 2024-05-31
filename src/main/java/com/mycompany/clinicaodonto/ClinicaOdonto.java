/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clinicaodonto;

import controller.Controller;
import controller.FuncionarioController;
import controller.PacienteController;
import view.Login;
import view.cadastro.Cadastro;
import view.cadastro.CadastroFuncionario;
import view.cadastro.CadastroPaciente;

/**
 *
 * @author Beatriz
 */
public class ClinicaOdonto {

    public static void main(String[] args) {
        new Cadastro(null, false,new CadastroPaciente(), new PacienteController()).setVisible(true);
    }
}
