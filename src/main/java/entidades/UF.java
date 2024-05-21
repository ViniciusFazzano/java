/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import static entidades.TipoPagamento.values;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Optional;

/**
 *
 * @author Beatriz
 */
public enum UF{
   AC(1),AL(2),AP(3),AM(4),BA(4),CE(5),DF(6),ES(7),GO(8),MA(9),
   MT(10),MS(11),MG(12),PA(13),PB(14),PR(15),PE(16),PI(17),RJ(18),
   RN(19),RS(20),RO(21),RR(22),SC(23),SP(24),SE(25),TO(26);
        
   public final Integer codigo;
   
   UF(Integer codigo) {
        this.codigo = codigo;
    }

  public static Optional<UF> buscarPorCodigo(Integer codigo) {
       return Arrays.stream(values())
                    .sequential()
                    .filter(t -> t.codigo.equals(codigo))
                    .findFirst();
    }
}
