package others.io;

import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter writeFile = new FileWriter("C://Users//huzai//filetest.txt",true);//,true make file or replace if already present with same name lost old content write same on each run if true
            writeFile.write(97);//ASCII CODE OF A write a on file
            writeFile.write(98);//b
            writeFile.write("\n");//writ sting
            writeFile.write("hi");//d
            char ch [] = {'f','c','j'};
            writeFile.write(ch);

            writeFile.close();//save file content
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
