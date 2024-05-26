/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 *
 * @author Beatriz
 */
@Entity
public @Data class Paciente implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nome;
    @Column
    private String cpf;
    @Temporal(TemporalType.DATE)
    private Date dataNasc;
    @Column
    private String numCasa;
    @ManyToOne
    private Endereco endereco_id;
    @ManyToOne
    private Paciente responsavel;

    
}
