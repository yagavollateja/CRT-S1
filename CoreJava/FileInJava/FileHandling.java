import java.io.File;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args) throws IOException {
        //create a file by using File class
        //File f = new File("D:\\PROGRAMMING HUB\\JAVA\\CoreJava\\FileInJava\\resume.txt");
        //System.out.println(f.createNewFile());//create a new file
        //System.out.println(f.delete());//delete a file
        // if(f.exists()){
        //     f.delete();
        //     System.out.println("File deleted successfully.");
        // }
        // f.createNewFile();
        // System.out.println("File created successfully.");
        // System.out.println(f.isHidden());//check if the file is hidden
        // System.out.println(f.canWrite());//check if the file is writable
        // System.out.println(f.setReadOnly());//set the file to read only
        // f.setWritable(true);//set the file to writable
        File f1 = new File("./resume");
        f1.mkdir();//create a directory
        System.out.println("Directory created successfully.");
        f1.createNewFile();
        if (f1.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }
    
    }
}