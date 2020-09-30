package org.pin.AtmApp;

public class HdfcImpl implements IAtm
{
	@Override
	public void withDraw( ) 
	{
		System.out.println("withdraw money using hdfc card");
		
	}

	@Override
	public void depositMoney( )
	{
		System.out.println("deposit money");
		
	}
	

}
