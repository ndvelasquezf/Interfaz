/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario2
 */
public class MessageListener implements ActionListener {
    public void actionPerformed (ActionEvent event) {
        JOptionPane.showMessageDialog(null, "You clicked the button.");
    }
    
    
}
