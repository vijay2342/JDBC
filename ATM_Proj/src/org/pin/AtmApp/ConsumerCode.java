package org.pin.AtmApp;

import java.util.Scanner;

public class ConsumerCode {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the bank");
		String bk=scan.next();
		scan.close();
		
		IAtm m=AtmFactory.getInstance(bk);
		if(m!=null) 
		{
			m.depositMoney();
			m.withDraw();
		}
		

	}

}
