package NumberPrograme;

public class PalindromNumber 
{public static void main(String[] args) 
{
//	int number=121;
//	int reverse=0;
//    int tempnumb=121;
//	while(tempnumb !=0)
//	{
//		int rem=0;
//	rem=tempnumb%10;
//	reverse=(reverse*10)+rem;
//	tempnumb=tempnumb/10;
//	
//	}
//	System.out.println(reverse);
//
//if(number==reverse)
//{System.out.println("the number is palindrom ");
//}
//else
//{System.out.println("number is not palindrom ");}
	
//	ex.2 
//	int number=761;
//	int tempnumb=761;
//	int reverse=0;
//	
//	while(tempnumb !=0)
//	{
//		int rem=0;
//		rem=tempnumb%10;
//		reverse=reverse*10+rem;
//		tempnumb=tempnumb/10;
//		
//	}
//	System.out.println(reverse);
//	if(tempnumb==reverse)
//	{System.out.println("number is palindrom");}
//	else
//	{System.out.println("number is not palindrom");
//}
	
//	ex.3
	
//	int number=232;
//	int tempnumb=232;
//	int reverse=0;
//	
//	while(tempnumb !=0)
//	{
//		int rem=0;
//		rem=tempnumb%10;
//		reverse=reverse*10+rem;
//		tempnumb=tempnumb/10;
//	}
//	System.out.println(reverse);
//	if(number==reverse)
//	{System.out.println("the number is palindrom");
//	}
//	else 
//	{System.out.println("number is not palindrom");
//	}
	
	//ex.4
//	int num=313;
//	int temp=num;
//	int rem=0;
//	int reverse=0;
//	
//	while(temp !=0)
//	{ 
//		rem=temp%10;
//		reverse=reverse*10+rem;
//		temp=temp/10;
//	}
//	System.out.println(reverse);
//	if(reverse==num)
//	{System.out.println("the number is palindrom");
//	}
//	else
//	{System.out.println("the number is not palindrom");}
	
     int num=121;
     int temp=num;
     int rem=0;
     int rev=0;
     
     while(temp!=0)
     {
    	 rem=temp%10;
    	 rev=rev*10+rem;
    	 temp=temp/10;
    	 
     }
     if(rev==num)
     {
    	 System.out.println("is a palindrom num");
     }
     else
     {
    	 System.out.println("is not a palindrom num");
     }
}
}
	
	