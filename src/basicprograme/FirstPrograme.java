package basicprograme;

public class FirstPrograme
{
//	EX.1
//public static void printpattern()
//{for(int i=1;i<=3;i++)
//	{System.out.println(i);}
//}
//public static void main(String[] args)
//{      printpattern();
//	{System.out.println("AKSHAY");}
//	
//	printpattern();
//	{System.out.println("AKSHAY");}
//	
//	printpattern();
//	{System.out.println("AKSHAY");}
//	
	
//	EX.2
	
//	public static void printpattern()
//	{for(int i=1;i<=7;i++)
//		System.out.println("day -"+ i);
//}
//	public static void main(String[] args) 
//	{
//		System.out.println("week 1");
//		printpattern();
//		System.out.println();
//		
//		System.out.println("week 2");
//		printpattern();
//		System.out.println();
//		
//		System.out.println("week 3");
//		printpattern();
//		System.out.println();
//		
//		System.out.println("week 4");
//		printpattern();
//		System.out.println();
	
//	ex.3
//	static keyword=static method
//	public static void additionmethod()
//	{
//		int a=10;
//		int b=20;
//		int c=a+b;
//		
//		System.out.println(c);
//	}
//	
////	
//	public static void main(String[] args) 
//	{    //method call
//		additionmethod();
////		or
//		
//		FirstPrograme.additionmethod();
//		
		
//		ex.4
//	non static method
//	public void addmethod()
//	{
//		int a=10;
//		int b=20;
//		int c=a+b;
//		
//		System.out.println(c);
//	}
//	
//	public static void main(String[] args) 
//	{    //non-static method
//		not possible
//		addmethod();
//		or
//		FirstPrograme.addmethod();
	
//	ex.5
	
//	public static void addition()
//	{
//		int a=20;
//		int b=10;
//		int c=a+b;
//		
//		System.out.println(c);
//	}
//	public static void main(String[] args)
//	{  //it return nothing
////		int x=addition();
	
//	ex.6
	
	public static int addmethod()
	{int a=20;
	int b=10;
	int c=a+b;
	System.out.println(c);
	return c;
	}
	
    public static void main(String[] args) 
	{
//		//addmethod();
//		
     	int x=addmethod();
		System.out.println(x);
		System.out.println(x+100);
	}

}