import java.util.Scanner;
class forloop1
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a,n;
System.out.println("Enter number :");
n=in.nextInt();
for(a=1;a<10;a++)
{
System.out.print(a+"*"+n+"=");
System.out.println(a*n);
}
}
}