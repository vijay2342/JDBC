package org.btm.properties_Proj;
import java.io.*;
import java.util.Properties;

public class PropertiesApp 
{
	public static void main(String[] args) 
	{
		FileReader fr=null;
		Properties p=new Properties();
		
		try {
			fr=new FileReader("Demo.properties");
			p.load(fr);
			//p.properties is non static method present in Properties class
			String user=p.getProperty("user");
			String password=p.getProperty("pwd");
			System.out.println(user);
			System.out.println(password);
			System.out.println("done with reading ");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		finally {
			if(fr!=null)
			{
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
