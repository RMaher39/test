package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Properties;

public class LoadProperties
{
	
	public static Properties userData = loadproperties(System.getProperty("user.dir")+"/src/test/java/data/file2.properties.txt");
	
	private static Properties loadproperties(String path) {
		
	Properties pro = new Properties();

		try {
			FileInputStream stream= new FileInputStream(path);
			
//				pro.load(stream,"UTF-8");
				pro.load(new InputStreamReader(stream, Charset.forName("UTF-8")));
				}
			catch (FileNotFoundException e) {
				System.out.println("error occured");
			}catch (IOException e) {
				System.out.println("errp occured");
		} 
	
	return pro;
  

		}}
