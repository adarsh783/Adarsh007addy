import java.util.Scanner;
class alphabet
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
char n;
System.out.println("Enter character :");
n=in.next().charAt(0);
int b=n;
if(b>=65  && b<=90 || b>=97 && b<=122)
{
System.out.println("not special charcter  "+n);
}
else
{
System.out.println("special character "+n);
}
}
}