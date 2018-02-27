package javaapplication2;

import java.io.*;

public class BufferedReaderWriterBobExample {

    public static void main(String[] args) {
        File file = new File("bobs.txt");

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter("isBobs.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals("Bob")) {
                    bufferedWriter.write("This is a Bob\n");
                } else {
                    bufferedWriter.write("This is not a Bob \n");
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (fileReader != null) {
                    fileReader.close();

                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
