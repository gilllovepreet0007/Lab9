//QUE 9.1

import java.io.FileReader;
import java.io.IOException;import java.util.Map;
import java.util.Properties;

public class Proper {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("config.properties");
		Properties p=new Properties();
		p.load(fr);
		System.out.println("UserName " + p.getProperty("username"));
		System.out.println("PassWord " + p.getProperty("password"));
		System.out.println("DateOfBirth " + p.getProperty("DOB"));
		System.out.println("Contact " + p.getProperty("MobNo"));
		
		for (Map.Entry<Object,Object> m:p.entrySet()) {
			System.out.println(m.getKey().toString()+" = "+m.getValue().toString());
		}
		

	}

}
