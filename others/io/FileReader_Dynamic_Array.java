package others.io;

import java.io.File;
import java.io.FileReader;

public class FileReader_Dynamic_Array {
    public static void main(String[] args) {
        try {
            File dynamicRead = new File("C://Users//huzai//file.txt");
            FileReader reader = new FileReader(dynamicRead);
            char[] ch = new char[(int) dynamicRead.length()]; //it is long so convert it to int by type casting
            reader.read(ch);

            for (char charPrint : ch) {
                System.out.print(charPrint);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
