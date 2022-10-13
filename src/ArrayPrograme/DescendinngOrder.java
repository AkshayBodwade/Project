package ArrayPrograme;

public class DescendinngOrder 
{
public static void main(String[] args)
{
	int a[]= {15,24,35,14,23,8,71,16,42};
	int temp=0;
	{
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i;j<=a.length-1;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			System.out.println(a[i]);
		}
	}
}
}
