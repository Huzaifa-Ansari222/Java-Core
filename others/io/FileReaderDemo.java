package others.io;

import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader read = new FileReader("C://Users//huzai//file.txt");
            int content = read.read();
            System.out.println((char)content);
            System.out.println(content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
