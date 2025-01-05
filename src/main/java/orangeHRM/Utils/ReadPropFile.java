package orangeHRM.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {

    public  static Properties readFile(String path) throws IOException {
        FileInputStream newFile=new FileInputStream(new File("C:\\Users\\molla\\BSelenium\\OrangeHRMdemo\\browserSpecification.properties"));
        Properties prop=new Properties();
       prop.load(newFile);
       return prop;
    }
}
