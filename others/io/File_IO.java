package others.io;

import java.io.File;

public class File_IO {
    public static void main(String[] args) {
        //check method
        File f = new File("C://top-coder-book//CompetitiveProgrammerHandbookCourse.pdf");//true
        boolean check = f.exists(); //give true if file exist on c: drive if not give false
        System.out.println(check);

        //delete method
        File f2 = new File("C://top-coder-book//bookCourse.pdf");
        boolean check2 = f2.delete();//delete file if path correct
        System.out.println(check2); //if delete return true / not data or not delte return false

        //mkdir method / make directory
        File f3 =  new File("C://path//subpath//folderName");//goes to this path
        boolean check3 = f3.mkdir();//make folder
        System.out.println(check3);

        //length method / count Char + space inside the file
        File f4 =  new File("C://top-coder-book//CompetitiveProgrammerHandbookCourse.pdf");//goes to this path
        long check4 = f4.length();//return count of cahr and spaces
        System.out.println(check4);
    }
}
