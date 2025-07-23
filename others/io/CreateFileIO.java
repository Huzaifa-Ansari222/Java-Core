package others.io;
import java.io.File;
import java.io.IOException;

public class CreateFileIO {
    public static void main(String[] args) {
        try {
            File file =  new File("C://Users//huzai//file.txt");//file made and run well
            boolean check =  file.createNewFile();
            System.out.println(check);//true /  false if not made or retry with same name
        } catch (IOException e) {
//            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
