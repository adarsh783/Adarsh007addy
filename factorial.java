import java.util.Scanner;
class factorial
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a,n,f=1;
System.out.println("Enter n value :");
n=in.nextInt();
for(a=1;a<=n;a++)
{
	f=f*a;
}
	System.out.println(f);
	}
	}
