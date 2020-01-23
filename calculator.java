import java.util.Scanner;
class calculator
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
double x,y;
System.out.println("Enter x,y values :");
x=in.nextDouble();
y=in.nextDouble();
char operator;
System.out.println("Enter operator(+,-,*,/) :");
operator=in.next().charAt(0);
double output=0;
switch(operator)
{
case '+':
	output=x + y;
	break;
case '-':
	output=x - y;
	break;
case '*':
	output=x * y;
	break;
case '/':
	output=x / y;
	break;
default :
	System.out.println("you haVe entered wrong operator ");
	}
	System.out.print(x+ " " +operator+ " " +y+ ": " +output);
	}
	}