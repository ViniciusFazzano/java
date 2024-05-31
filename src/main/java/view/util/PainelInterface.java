/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.util;

import com.mycompany.clinicaodonto.dto.DTO;
import javax.swing.JPanel;

/**
 *
 * @author Beatriz
 */
public abstract class PainelInterface extends JPanel{
    public abstract DTO salvar();
    public abstract void preencheCampos(DTO dto);    
    
}
