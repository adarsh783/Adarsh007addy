import java.util.Scanner;
class forloop
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a,n;
System.out.println("Enter a value :");
n=in.nextInt();
for(a=1;a<=10;a++)
{
	System.out.print(n+ "*" +a+ "=");
	System.out.println(n*a);
	}
	}
	}