/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Arrays;
import java.util.Optional;

/**
 *
 * @author Beatriz
 */
public enum TipoPagamento {
    CREDITO(1), DEBITO(2), PIX(3), DINHEIRO(4);
    
   public final Integer codigo;
   
   TipoPagamento(Integer codigo) {
        this.codigo = codigo;
    }

  public static Optional<TipoPagamento> buscarPorCodigo(Integer codigo) {
       return Arrays.stream(values())
                    .sequential()
                    .filter(t -> t.codigo.equals(codigo))
                    .findFirst();
    }
}
