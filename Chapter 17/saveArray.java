package javaapplication;

import java.io.*;
import javax.swing.JFileChooser;

public class saveArray {

    public static void saveArray(String[] v, String filename) throws IOException {
        FileWriter f = new FileWriter(filename);
        PrintWriter out = new PrintWriter(f);
        for (int i = 0; i < v.length; i++) {
            out.println(v[i]);
        }
        out.close();
        f.close();
    }


public static void main(String[] args) throws IOException {

        String[] x = {"one","two","three"};
        
         saveArray(x, "output.txt");
    }
}
