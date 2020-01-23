import java.util.Scanner;
class loop
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a,n;
System.out.println("Enter a value :");
n=in.nextInt();
for(a=1;a<=10*n;a=a++)
{
	System.out.print(n);
	System.out.print(" *");
	System.out.print(a);
	System.out.print(" = ");
	System.out.println(n*a);

	}
	}
	}
