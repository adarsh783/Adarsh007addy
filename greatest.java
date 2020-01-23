import java.util.Scanner;
class greatest
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a,b,c;
System.out.println("Enter a,b,c value :");
a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
if(a>b && a>c)
{
	System.out.println("greatest number "+a);
}
	else
	{
		if(b>c && b>a)
		{
	System.out.println("greatest number "+b);
	}
	else
	{
		System.out.println("greatest number "+c);
	}
	}
}
}

