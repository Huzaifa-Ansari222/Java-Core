package others.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Q1_CreateFile_Write {
    public static void main(String[] args) {
        try {
            File file = new File("C://Users//huzai//Q1_createFile_write.txt");

            FileWriter writeFiles = new FileWriter(file,true);
            BufferedWriter bufferedReaderVar = new BufferedWriter(writeFiles);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter file content:");
            String input = sc.nextLine();

            bufferedReaderVar.write(" "+input+" ");
            sc.close(); // Close scanner
            bufferedReaderVar.close();
            System.out.println("Done");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}

