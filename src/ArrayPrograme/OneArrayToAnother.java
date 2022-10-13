package ArrayPrograme;

public class OneArrayToAnother  
{public static void main(String[] args) 
{
	int a[]= {20,10,51,40,65};
	
	int x[]=new int[5];
	
	x[0]=20;
	x[1]=10;
	x[2]=51;
	x[3]=40;
	x[4]=65;
	
	for(int i=0;i<=x.length-1;i++)
	System.out.println(x[i]);
	
}

}
