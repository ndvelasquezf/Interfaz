/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carro;

import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author usuario2
 */
public class Carro extends JPanel implements ActionListener, KeyListener{
    private int x;
    private int y;
    private Timer timer;
    
    public Carro(){
        this.x= 40;
        this.y= 80;
        this.addKeyListener(this);
        this.setFocusable(true);
        this.timer = new Timer (5, this);
        this.timer.start();
    }
    
    protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(new Color (185, 211, 238));
    g.fillOval(this.x,this.y,30,30);
    g.setColor(BLACK);
    g.fillOval(this.x+10, this.y+10, 10, 10);
    g.setColor(new Color (185, 211, 238));
    g.fillOval(this.x+60,this.y,30,30);
    g.setColor(BLACK);
    g.fillOval(this.x+70, this.y+10, 10, 10);
    g.setColor(new Color (0, 250, 154));
    g.fillRoundRect(this.x-20, this.y-26, 130, 30,10,10);
    int x[] = {this.x+10,this.x+28,this.x+56,this.x+75};
    int y[] = {this.y-26,this.y-50,this.y-50,this.y-26};
    g.setColor(new Color (202, 255, 112));
    g.fillPolygon(x, y, 4);
    
    }   

    @Override
    public void actionPerformed(ActionEvent e) {
      /*  this.x+=1;
        /*this.y+=1;*/
        if(this.x>1350)
            this.x=0;
        if(this.y>400)
            this.y=0;
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Me han presionado");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_DOWN: y += 10; break;
            case KeyEvent.VK_UP: y -= 10; break;
            case KeyEvent.VK_LEFT: x -= 10; break;
            case KeyEvent.VK_RIGHT: x += 10; break;
          }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
