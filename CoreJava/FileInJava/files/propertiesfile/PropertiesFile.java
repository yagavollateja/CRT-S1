package files.propertiesfile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
public class PropertiesFile {
    public static void main(String[] args) throws Exception{
        //create file instance
        File file = new File(".\\files\\propertiesfile\\dbConfiguratin.properties");
        //check if file exists
        if (!file.exists()) {
            file.createNewFile();
        }
        System.out.println(file.exists());
        //delete file
        // file.delete();
        // System.out.println(file.exists());
        Properties prop = new Properties();
        //load properties file
        prop.setProperty("url","localhost");
        prop.setProperty("username","yagavollateja");
        prop.setProperty("password","Teja@2006");
        FileOutputStream fos = new FileOutputStream("prop");
        prop.store(fos, "Database Configuration");
        FileInputStream fis = new FileInputStream(file);
        prop.load(fis);
        //Set<String> keys = prop.stringPropertyNames();
        Set<Object> keys = prop.keySet();
        System.out.println(keys);
        // for (String string : keys) {
        //     System.out.println(string + " : " + prop.getProperty(string));
        // }
        //To read the properties file, you can use the following code:
        // prop.stringPropertyNames().forEach(key -> {
        //     System.out.println(key + " : " + prop.getProperty(key));
        // });
        //present value present in properties file return that value otherwise new value return 
        System.out.println(prop.getProperty("url", "new value"));
        System.out.println(prop.getProperty("username", "new value"));
        //third method to read properties file
        Set <Entry<Object, Object>> data = prop.entrySet();
        //printing the properties file
        System.out.println("Properties file data:");
        for (Entry<Object, Object> entry : data) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        //upadate properties file
        prop.setProperty("url", "localhost:8080");
        // prop.setProperty("username", "yagavollateja@123");
        // prop.setProperty("password", "Teja@2006@123");
        prop.load(fis);
        //prop.remove("url");
        for (Entry<Object, Object> entry : data) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        fos.close();
    }
}
