import java.util.Scanner;
class prime
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,flag=0;
System.out.println("Enter number :");
n=in.nextInt();
for(int a=2;a<=n/2;a++)
{
if(n%a==0)
{
flag=3;
break;
}
}
if(flag==3)
{
System.out.println("not prime number :"+n);
}
else
{
	System.out.println("prime number :"+n);
}
}
}
