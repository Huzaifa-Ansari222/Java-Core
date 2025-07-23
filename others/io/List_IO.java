package others.io;

import java.io.File;

public class List_IO {
    public static void main(String[] args) {
        File file = new File("C://Users//huzai");

        //Get list of files/folders inside it
        String[] check = file.list();  // returns array of names inside the folder of huzai

        for ( String x: check) {
            System.out.println(x);
        }
        System.out.println("total items: "+check.length); //number of entries (files + folders)

    }
}
