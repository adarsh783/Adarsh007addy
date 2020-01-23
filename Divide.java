import java.util.Scanner;
class Divide
{
int divid()
{
int a,b,c;
Scanner in=new Scanner(System.in);
System.out.println("Enter a,b value :");
a=in.nextInt();
b=in.nextInt();
c=a/b;
return(c);
}
public static void main(String args[])
{
	int c;
Divide in=new Divide();
c=in.divid();
System.out.println("Divide is :"+c);
}
}