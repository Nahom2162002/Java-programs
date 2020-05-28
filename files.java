/*This program allows you to view files*/

import java.io.*;
import java.util.*;
import javax.swing.*;

public class files
{
    public static void main(String [] args) throws FileNotFoundException
    {
        Scanner inTxt = new Scanner(new File("file.txt"));
        while (inTxt.hasNext())
        {
           String text = inTxt.nextLine();
           System.out.println(text);
        }
        JFileChooser chooser = new JFileChooser();
        Scanner inchoose = null;
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            File selectedfile = chooser.getSelectedFile();
            inchoose = new Scanner(selectedfile);
        }
        PrintWriter out = new PrintWriter("file.txt");
        while (inchoose.hasNext())
        {
            String text2 = inchoose.nextLine();
            out.println(text2);
            System.out.println(text2);
        }
        out.close();
    }
}
