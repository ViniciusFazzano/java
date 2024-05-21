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
public @Data class FormaPagamento implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer tipo_pagamento;
    @Column
    private Integer valor;
    @OneToOne
    private Consulta consulta_id;
    
    public void setTipoDePagamento(TipoPagamento tipoPagamento){
      this.tipo_pagamento = tipoPagamento.codigo;
   }
    
    public Optional<TipoPagamento> getTipoDePagemento(){
      return TipoPagamento.buscarPorCodigo(this.tipo_pagamento);
   }
}
