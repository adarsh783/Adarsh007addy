import java.util.Scanner;
class numbe
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n;
System.out.println("Enter the number(1 to 3) :");
n=in.nextInt();
switch(n)
{
case 1:
	System.out.println("number is 1");
	break;
case 2:
	System.out.println("number is 2");
	break;
case 3:
		System.out.println("number is 3");
	break;
default :
	System.out.println("number is invalid");
	break;
	}
	}
	}