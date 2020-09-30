package org.pin.AtmApp;

public class AtmFactory 
{
	public static IAtm getInstance(String str)
	{
		if(str.equalsIgnoreCase("HDFC"))
		{
			HdfcImpl hd=new HdfcImpl();
			return hd;
		}
		else
			System.err.println("no atmcard found");
		
		return null;
	}

}
