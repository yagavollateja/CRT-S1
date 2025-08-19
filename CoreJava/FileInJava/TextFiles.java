import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TextFiles {
    public static void main(String[] args) throws IOException{
        File file = new File(".\\resume.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileInputStream fis = new FileInputStream(file);
        String str = "";
        while(fis.read() != -1){
            str += (char)fis.read();
        }
        System.out.println(str);
        fis.close();
    }
}
