/*This program prompts the user to answer a question with either a yes or no*/
import javax.swing.*;
import java.util.*;

public class joptionpanepractice
{
    public static void main(String [] args)
    {
       int x = JOptionPane.showConfirmDialog(null, "Are you doing good today?", "Hello!", JOptionPane.YES_NO_OPTION);
       if (x == JOptionPane.YES_OPTION)
       {
          JOptionPane.showMessageDialog(null, "That's good");
       }
       else if (x == JOptionPane.NO_OPTION)
       {
          JOptionPane.showMessageDialog(null, "That's not good to hear");
       }
    }
}
