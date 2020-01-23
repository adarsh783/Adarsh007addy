import java.util.Scanner;
class month
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int month;
System.out.println("Enter day name(0 to 7) :");
month=in.nextInt();
switch(month)
{
case 0:
	System.out.println("jan");
	break;
case 1:
	System.out.println("feb");
	break;
case 2:
	System.out.println("mar");
	break;
case 3:
	System.out.println("apr");
	break;
case 4:
	System.out.println("may");
	break;
case 5:
	System.out.println("june");
	break;
case 6:
	System.out.println("july");
	break;
default :
	System.out.println("Invalid month ");
	break;
	}
	System.out.print("month : " +month);
	}
	}