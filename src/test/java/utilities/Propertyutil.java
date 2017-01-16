package utilities;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.opc.internal.FileHelper;
 

 
public class Propertyutil {
	final static Logger logger = Logger.getLogger(Propertyutil.class);
	
	static String result = "";
	static InputStream inputStream;
 
	public  static String getPropValues(String key) throws IOException {
 
		try {
			logger.debug("Request for key "+key);
			Properties prop = new Properties();
			String propFileName = "config.properties";
 
			//inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
			inputStream =   FileHelper.class.getClassLoader().getResourceAsStream("config.properties");
 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
 
			
				result = prop.getProperty(key);
				logger.debug("value for key "+key+" is:"+result);
			return result;
			} catch (Exception e) {
			logger.error("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return result;
	}


	//main method to test properties file
	public static void main(String[] args) {
			
		try {
			System.out.println(getPropValues("excelworksheet"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}