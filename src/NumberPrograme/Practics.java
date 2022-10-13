package NumberPrograme;

public class Practics 
{public static void main(String[] args)
{int num=121;
 int temp=num;
int rem=0;
int reverse=0;

while(temp !=0)
{rem=temp%10;
 reverse=reverse*10+(rem);
 temp=temp/10;
}
System.out.println(reverse);
if(num==reverse)
{
System.out.println(num+" is a pallindrom number");}
else
System.out.println(num+"  is not a pallindrom number");

}
}
