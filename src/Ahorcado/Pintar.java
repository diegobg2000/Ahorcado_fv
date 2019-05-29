package Ahorcado;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Archive: Pintar.java
 */
public class Pintar extends JPanel
{
    private int fallo = 0;
    
 
    
    public Pintar()
    {
        setSize(300,300);/*Dentro de la clase pintar, el conatructor pintar el tamaño es (ancho, alto)*/
    }
    
    public void paintComponent(Graphics g)/*Dibujara todo el lienzo*/
    {
    	
        super.paintComponent(g);
        g.setColor(Color.RED);/*Color del que va a ir pintadas las posteriores lineas*/
        g.fillRect(0, 250, 300, 50);
        g.fillRect(0, 10, 10, 350);
        g.fillRect(10, 10, 150, 10);/*Dibuja una linea gruesa*/
        g.drawLine(150, 10, 150, 50);/*Dibuja una liena fina*/ /*P1x,P1y, P2x, P2y */
        
        if(fallo == 0)
        {
            
        }
        if(fallo == 1)
        {
            //cabeza
            g.drawOval(125, 50, 50, 50);
        }
        else if(fallo == 2)
        {
            //cabeza
            g.drawOval(125, 50, 50, 50);
            //tronco
            g.drawLine(150, 100, 150, 160);
        }
        else if(fallo == 3)
        {
            //cabeza
            g.drawOval(125, 50, 50, 50);
            //tronco
            g.drawLine(150, 100, 150, 160);
            //brazo derecho
            g.drawLine(150, 100, 100, 130);
        }
        else if(fallo == 4)
        {
            //cabeza
            g.drawOval(125, 50, 50, 50);
            //tronco
            g.drawLine(150, 100, 150, 160);
            //brazo derecho
            g.drawLine(150, 100, 100, 130);
            //brazo izq
            g.drawLine(150, 100, 200, 130);
        }
        else if(fallo == 5)
        {
            //cabeza
            g.drawOval(125, 50, 50, 50);
            //tronco
            g.drawLine(150, 100, 150, 160);
            //brazo derecho
            g.drawLine(150, 100, 100, 130);
            //brazo izq
            g.drawLine(150, 100, 200, 130);
            //pierna derecha
            g.drawLine(150, 160, 100, 200);
        }
        else if(fallo == 6)
        {
             //cabeza
            g.drawOval(125, 50, 50, 50);
            //tronco
            g.drawLine(150, 100, 150, 160);
            //brazo derecho
            g.drawLine(150, 100, 100, 130);
            //brazo izq
            g.drawLine(150, 100, 200, 130);
            //pierna derecha
            g.drawLine(150, 160, 100, 200);
            //pierna izq
            g.drawLine(150, 160, 200, 200);
        }
    }
    
    public void error(int error)
    {
        fallo= error;
        this.repaint();
    }
}
