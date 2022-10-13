package ArrayPrograme;

public class Find2ndLargest 
{
public static void main(String[] args) 
{
	int a[]= {10,23,14,50,16,70,49,58};
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
		System.out.println("second largest "+a[1]);
	}
	
}
}
