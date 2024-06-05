/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import lombok.Data;
/**
 *
 * @author Beatriz
 */
@Entity
public @Data class Agendamento implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dia;
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date hora;
    @ManyToOne
    private Paciente paciente;
    @ManyToOne
    private Funcionario dentista;
    @ManyToOne
    private Funcionario recepcionista_id;
}
