package ArrayPrograme;

public class DuplicateNumber 
{
public static void main(String[] args) 
{
	int a[]= {10,40,20,56,40,20,14};
	{
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}
}
