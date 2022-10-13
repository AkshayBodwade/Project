package ArrayPrograme;

public class SmallestElement 
{public static void main(String[] args)

{
	int a[]= {10,50,40,56,8,74};
	int min=a[0];
  {for(int i=0;i<=a.length-1;i++)
  {if(a[i]<min)
  {min=a[i];
  }
  }
  System.out.println("minimum number is-"+min);
}
}
}