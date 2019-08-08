package testNGDemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Propertiesfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//readPorfile();
		Writefile();
	}
public static void readPorfile() throws IOException {
	Properties prop = new Properties();
	InputStream input = new FileInputStream("C:\\Users\\srinivas.godari\\eclipse-workspace\\MyDemo03\\src\\test\\java\\testNGDemos\\config.properties");
    prop.load(input);
    System.out.println(prop.getProperty("DCNO"));
    System.out.println(prop.getProperty("DCNO"));
    System.out.println(prop.getProperty("DCNO"));
   
}
public static void Writefile() throws IOException {
	Properties prop = new Properties();
	OutputStream Output = new FileOutputStream("C:\\Users\\srinivas.godari\\eclipse-workspace\\MyDemo03\\src\\test\\java\\testNGDemos\\config.properties");
    prop.setProperty("Domain", null);
    prop.store(Output, null);
    System.out.println(prop.getProperty("Browser"));
   
}
}