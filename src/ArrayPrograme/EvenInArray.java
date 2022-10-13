package ArrayPrograme;

public class EvenInArray
{
public static void main(String[] args) 
{
	int a[]= {10,15,14,12,11,19};
	
	for(int i=0;i<=a.length-1;i++)
	{if(a[i]%2==0)
	{System.out.println("even number-"+a[i]);}
	
	else
	{System.out.println("odd number-"+a[i]);}
}
}
}