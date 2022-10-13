package basicprograme;

public class AscendingOrder1 
{public static void main(String[] args) 
{
	int a[]= {20,30,11,50,5};
	int temp=0;
	for(int i=0;i<=(a.length-1);i++)
	{
		for(int j=i;j<=(a.length-1);j++)
		{if(a[i]>a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		} 
		}
	
	}
	for(int i=0;i<=(a.length-1);i++)
	{System.out.println(a[i]);
}
}
}
