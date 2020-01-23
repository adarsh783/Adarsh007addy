import java.util.Scanner;
class weekend
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int day;
System.out.println("Enter day name(0 to 6) :");
day=in.nextInt();
switch(day)
{
case 0:
	System.out.println("Monday");
	break;
case 1:
	System.out.println("Tuesday");
	break;
case 2:
	System.out.println("Wednesday");
	break;
case 3:
	System.out.println("Thursday");
	break;
case 4:
	System.out.println("Friday");
	break;
case 5:
	System.out.println("Saturday");
	break;
case 6:
	System.out.println("Sunday");
	break;
default :
	System.out.println("Invalid day ");
	break;
	}
	System.out.print("day : " +day);
	}
	}