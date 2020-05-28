/*This program creates a frame that draws a circle */

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class circle extends JFrame
{
    public circle()
    {
       setTitle("Circle");
       setSize(400, 400);
       setLayout(null);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void paint(Graphics g)
    {
       g.drawOval(50, 100, 40, 30);
    }
    
    public static void main(String [] args)
    {
       circle c = new circle();
       c.paint(null);
    }
    
    public class frame extends JPanel
    {
       private static final int GRAPH_WIDTH = 100;
       private static final int GRAPH_HEIGHT = 100;
       public Color gridcolor = new Color(200, 200, 200, 200);
       public Color linecolor = new Color(200, 200, 200, 200);
       public Color color = new Color(200, 200, 200, 200);
    }
}
