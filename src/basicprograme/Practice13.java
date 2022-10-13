package basicprograme;

public class Practice13
{public static void main(String[] args) 
//ex1- swapping method with third variable
//{int a=10;
//int b=20;
//int c;
//c=a;
//a=b;
//System.out.println("a after swapping- "+ a);
//b=c;
//System.out.println("b after swapping- "+ b);
//	}

//	ex.2 swapping method without third variable
//	{int a=20;
//	int b=10;
//	
//	a=a+b;
//	b=a-b;
//	System.out.println("b after swapping- "+b);
//	a=a-b;
//	System.out.println("a after swapping- "+a);
//	}
	
//	ex.3 reverse programe
	{int number=96
	;
    int reverse=0;
    
    while(number!=0)
    {int rem=0;
    rem =number%10;
    reverse= (reverse*10)+rem;
    number=number/10;
    }
 System.out.println(reverse);

if(reverse!=0)
{System.out.println("number is palle");
}}}