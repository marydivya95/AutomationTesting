package PropertiesFolder;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

    public static String PropFile(String PropName) throws IOException {
        //  C:\Users\softw\IdeaProjects\HinaProject\src\main\java\PropertiesFile\ProjectName.properties
        FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\PropertiesFile\\ProjectName.properties");
        Properties property = new Properties();
        property.load(fs);
        return property.getProperty(PropName);


    }
}


