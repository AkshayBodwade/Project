package basicprograme;

public class AscendingOrder 
{public static void main(String[] args) 
{
	int numb=13;
	int prime=0;
	
	for(int i=2;i<numb;i++)
	{if(numb%i==0)
	{
		prime=prime+1;
	}
	
}
	if(prime==0)
	{System.out.println("prime");
}
	else
	{System.out.println("not prime");
}
}}