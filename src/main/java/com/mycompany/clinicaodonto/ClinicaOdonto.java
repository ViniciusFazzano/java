/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.clinicaodonto;

import percistencia.login.LoginDao;
//import entidades.Login;
import percistencia.login.LoginImpl;

/**
 *
 * @author Beatriz
 */
public class ClinicaOdonto {
   

    public static void main(String[] args) {
//        Dao.getInstace().listar(Paciente.class, "");
//        new Cadastro(null, true, new CadastroConsulta(), new ConsultasController()).setVisible(true);
        LoginDao loginDao = new LoginImpl();
        entidades.Login login = new entidades.Login();
        login.setUsuario("a");
        login.setSenha("1");
        loginDao.salvar(login);
         view.Login2.main(args);
    }
}
