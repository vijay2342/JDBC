package org.btm.properties_Proj;

import java.io.*;
import java.util.Properties;

public class Read 
{
	public static void main(String[] args) 
	{
		FileWriter fw=null;
		Properties p=new Properties();
		p.setProperty("username","vijay");
		p.setProperty("Education", "BE");
		
		try {
			fw=new FileWriter("set.properties");
			p.store(fw, "storing done");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally {
			if(fw!=null)
			{
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
	}

}
