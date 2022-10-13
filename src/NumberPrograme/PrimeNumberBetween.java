package NumberPrograme;

public class PrimeNumberBetween 
{public static void main(String[] args) 
	{
//	for(int i=2;i<=100;i++)
//	
//	{int prime=0;
//	
//	for(int j=2;j<i;j++)
//		
//	{if(i%j==0)
//	{
//		prime=prime+1;
//	}
//	}
//	if(prime==0)
//	{System.out.println(i);}
//	}
	
//	for(int i=2;i<=100;i++)
//	{
//		int prime=0;
//		for(int j=2;j<i;j++)
//		{
//			if(i%j==0)
//			{
//				prime=prime+1;
//			}
//		}
//		if(prime==0)
//		{System.out.println(i);}
//	}
	
	for(int i=2;i<=100;i++)
	{
		int prime=0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				prime=prime+1;
			}
		}
		if(prime==0)
		{
			System.out.println(i);
		}
	}
	
	
	
	
	
	
	
	}}