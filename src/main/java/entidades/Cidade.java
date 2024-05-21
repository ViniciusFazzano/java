/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.Optional;

/**
 *
 * @author Beatriz
 */
@Entity
public @Data class Cidade implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer estado;
    
        
    public void setEstado(UF uf){
      this.estado = uf.codigo;
   }
    
    public Optional<UF> getEstado(){
      return UF.buscarPorCodigo(this.estado);
   }
}
