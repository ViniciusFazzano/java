/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import lombok.Data;
/**
 *
 * @author Beatriz
 */
@Entity
public  class Dentista extends Funcionario implements Serializable{
    
    private String cro;

}
