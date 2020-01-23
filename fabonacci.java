import java.util.Scanner;
class fabonacci
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int b=0,c=1,n;
System.out.println("Enter number :");
n=in.nextInt();
System.out.printf("%d%d",b,c);
for(int a=2;a<=n;a++)
{
int d=b+c;
System.out.printf("%d",d);
b=c;
c=d;
}
}
}