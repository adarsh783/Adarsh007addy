import java.util.Scanner;
class leapyear
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int b;
System.out.println("Enter b value :");
b=in.nextInt();
if(b%4==0)
{
	System.out.println("leap year : "+b);
}
	else
	{
		if(b%100==0)
		{
		System.out.println("leap year : "+b);
	}
	else
	{
		if(b%200==0)
		{
			System.out.println("leap year :"+b);
		}
		else
		{
			System.out.println("not a leap year :"+b);
		}
	}
}
  }
   }