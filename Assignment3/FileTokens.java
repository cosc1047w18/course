package javaapplication2;

import java.io.*;
import javax.swing.*;
import java.util.Scanner;

class FileTokens {

    public static void main(String[] args) throws IOException {
        Scanner in = null;
        PrintWriter out = null;
        String line = null;
        String[] token = null;
        int i, n, lineNumber = 0;
        File newFile = new File("input.txt");
        in = new Scanner(newFile);
        out = new PrintWriter(new FileWriter("output.txt"));
        in.useDelimiter("\n");
        while (in.hasNext()) {
            lineNumber++;
            line = in.next() + " "; // add extra space so split works right
            token = line.split("\\s+"); // split line around white space
            n = token.length;
            out.println("Line " + lineNumber + " contains " + n + " tokens:");
            for (i = 0; i < n; i++) {
                out.println(token[i]);
            }
            out.println();
        }
        in.close();
        out.close();
    }
}
