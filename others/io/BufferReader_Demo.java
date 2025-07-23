package others.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;

public class BufferReader_Demo {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("C://Users//huzai//filetest.txt");//must need FileReader class with bufferReader
            BufferedReader bufferFile = new BufferedReader(file);
            System.out.println((char)bufferFile.read()); //type cast to char
            //read file char content

            char ch[] = new char[4];
            bufferFile.read(ch);
            for (char c: ch) {
                System.out.print(c);
            }
            file.close();
            bufferFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
