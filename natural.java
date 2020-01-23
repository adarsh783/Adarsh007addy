import java.util.Scanner;
class natural
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,s;
System.out.println("Enter valuye of n :");
n=in.nextInt();
s=(n*(n+1)/2);
System.out.println("natural sum is :"+s);
}
}