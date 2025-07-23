package others.io;

import java.io.File;
import java.io.FileReader;

public class FileReader_Demo_Loop {
    public static void main(String[] args) {
        try {
            File dynamicReading = new File("C://Users//huzai//file.txt"); // it have dynamic length method
            FileReader reader = new FileReader(dynamicReading);//not dynamic reading file content in for loop length so no direct path given here
//            long fileLength = dynamicReading.length();
//            System.out.println("File size (bytes): " + fileLength);

            // Loop to read 4 characters
            for (int i = 0; i < dynamicReading.length(); i++) {// 45 char in file
                int ch = reader.read(); // read next char
                System.out.print((char)ch);
            }
//            reader.close(); // always close

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
