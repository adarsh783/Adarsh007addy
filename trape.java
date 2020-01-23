import java.util.Scanner;
class trape
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
double a,b,h,tr;
System.out.println("Enter a,b,h values:");
a=input.nextDouble();
b=input.nextDouble();
h=input.nextDouble();
tr=(1/2)*h*(a+b);
System.out.println("trapezoidal is Rs% .2f\n  : " +tr);
}
}