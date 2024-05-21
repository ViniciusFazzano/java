/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;

/**
 *
 * @author Beatriz
 */
@Entity
public @Data class Dentista extends Funcionario implements Serializable{
    @Column
    public String cro;

}
