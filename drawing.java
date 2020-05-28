/*This program opens up a frame which allows you to draw*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class drawing extends Frame implements MouseMotionListener
{
    drawing()
    {
        setTitle("Drawing");
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        addMouseMotionListener(this);
    }
    
    public void mouseDragged(MouseEvent e)
    {
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 20, 20);
    }
    
    public void mouseMoved(MouseEvent e)
    {
        Graphics g = getGraphics();
        g.setColor(Color.BLACK);
        g.fillOval(e.getX(), e.getY(), 20, 20);
    }
    
    public static void main(String [] args)
    {
        new drawing();
    }
}
