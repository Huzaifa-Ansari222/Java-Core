package others.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriter {
    public static void main(String[] args) {
        try {
            FileWriter writeFiles = new FileWriter("C://Users//huzai//filetest.txt");
            BufferedWriter bufferedReaderVar = new BufferedWriter(writeFiles);

            bufferedReaderVar.write("hi this is huzz trying to learn buffer writer");

//            FileWriter.close();
            bufferedReaderVar.close();
            System.out.println("done");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
