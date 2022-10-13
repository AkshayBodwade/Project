package ArrayPrograme;

public class LargestElement
{public static void main(String[] args) 

{
//	int a[]= {10,1,4,21,84,19,78};
// int max=a[0];
//  for(int i=0;i<=a.length-1;i++)
//  {if(a[i]>max)
//  {max=a[i];}
//  }
//  System.out.println(max);
	
	int a[]= {12,14,25,13,71,8};
	int min=a[0];
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println(min);
}
}
