/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Beatriz
 */
@Entity
public @Data class Agendamento implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Temporal(TemporalType.DATE)
    private Localdate data;
    @Temporal(TemporalType.TIME)
    private Localtime hora;
    @ManyToOne
    private Paciente paciente;
    @ManyToOne
    private Dentista dentista;
    @ManyToOne
    private Funcionario recepcionista_id;
}
