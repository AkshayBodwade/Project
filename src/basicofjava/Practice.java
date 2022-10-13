package basicofjava;

public class Practice 
{public static void main(String[] args) 
{
	
	int a[]= {15,24,10,24,10,17};
	int temp=0;
	
	for(int i=0;i<=a.length-1;i++)
	{for(int j=i+1;j<=a.length-1;j++)
	{if(a[i]==a[j])
	{System.out.println("duplicate number "+a[i]);}
	}
	
	}
}
}