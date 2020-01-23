import java.util.Scanner;
class factor
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a,n;
System.out.println("Enter number :");
n=in.nextInt();
for(a=1;a<=n;a++)
{
if(n%a==0)
System.out.println("number is even ");
}
else
{
	System.out.println("number is odd ");
}
}
}
