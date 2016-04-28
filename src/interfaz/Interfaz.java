/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;


import java.awt.*;
import javax.swing.*;

/**
 *
 * @author usuario2
 */
public class Interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**String name = JOptionPane.showInputDialog(null, "¿Cuál es su nombre?");
        int choice = JOptionPane.showConfirmDialog(null, "¿Le gusta el pastel " + name + "?");
        if(choice == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Por supuesto! A quién no?");
        }else{
            JOptionPane.showMessageDialog(null,"Vamos a tener que estar en desacuerdo");
        }
        * 
        * 
        JFrame frame = new JFrame ();
        frame.setVisible(true);
        
        
        JFrame frame = new JFrame ();
        Image icon = Toolkit.getDefaultToolkit().getImage("icon.gif");
        frame.setIconImage(icon);
        JPanel panel = (JPanel) frame.getContentPane();
        panel.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300, 120));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2,dim.height/2-frame.getSize().height/2);
        frame.setTitle("A frame");
        frame.setVisible(true);
        * */
        /**
        JFrame frame = new JFrame ();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300, 100));
        frame.setTitle("A frame");
        
        JButton button1 = new JButton();
        button1.setText("I'm a Button.");
        button1.setBackground(Color.GREEN);
        frame.add(button1);
        
        JButton button2 = new JButton();
        button2.setText("Click me.");
        button2.setBackground(Color.RED);
        frame.add(button2);
        
        frame.setVisible(true);
        **/
        /**
        JFrame frame = new JFrame ();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(400, 300));
        frame.setTitle("A frame");
        frame.setLayout(new FlowLayout());
        JLabel label = new JLabel ("Type your zip code: ");
        JTextField field = new JTextField (5);
        JButton button = new JButton();
        button.setIcon(new ImageIcon ("icon.gif"));
        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(field);
        frame.add(button);
        frame.pack();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2,dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
        **/
        
        JFrame frame = new JFrame ();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(400, 300));
        frame.setTitle("A frame");
        frame.setLayout(new FlowLayout());
        JLabel label = new JLabel ("Type your zip code: ");
        JTextField field = new JTextField (5);
        JButton button = new JButton();
        button.setIcon(new ImageIcon ("icon.gif"));
        button.addActionListener(new MessageListener());
        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(field);
        frame.add(button);
        frame.pack();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2,dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
    }
}
