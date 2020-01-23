import java.util.Scanner;
class vote
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a,b=18;
System.out.println("Enter a value :");
a=in.nextInt();
if(a<0)
{
	System.out.println("wrong attempt : "+a);
}
	else
	{
		if(a>=18)
		{
	System.out.println("eligible for vote : "+a);
}
	else
	{
	System.out.println("not eligible for vote :"+a);
		}
		}
		}
}