package org.secret.LoadingApp;

public class Demo 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Class Snake=Class.forName("org.secret.LoadingApp.Snake");
		
		System.out.println(Snake);
		
	}

}
