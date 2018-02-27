package javaapplication2;

import java.io.*;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class loadArray {

    public static String[] loadArray(String filename) throws IOException {
// We first read the file to count the number of line
        FileReader f = new FileReader(filename);
        BufferedReader in = new BufferedReader(f);
        int n = 0;
        String line = in.readLine();
        while (line != null) {
            n++;
            line = in.readLine();
        }
        f.close();
// Creation of the array
        String[] v = new String[n];
// Loop to read the strings from the file into the array
        f = new FileReader(filename);
        in = new BufferedReader(f);
        int i = 0;
        line = in.readLine();
        while ((line != null) && (i < n)) {
            v[i] = line;
            line = in.readLine();
            i++;
        }
        f.close();
        return v;
    }

    public static void main(String[] args) throws IOException {
        java.io.File file = null;
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null)
                == JFileChooser.APPROVE_OPTION) {

            // Get the selected file
            file = fileChooser.getSelectedFile();
        }
        String[] x = new String[100];
        x = loadArray(file.getAbsolutePath());
    }
}
