package others.io;

import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter writeFile = new FileWriter("C://Users//huzai//filetest.txt");//make file or replace if already present with same name
            System.out.println("done");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
