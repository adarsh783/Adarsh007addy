import java.util.Scanner;
class name
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
int a,b,c,d,e,f;
System.out.println("Enter a,b,c values :");
a=input.nextInt();
b=input.nextInt();
c=a+b;
d=a-b;
e=a*b;
f=a/b;
System.out.println("Addition is :"+c);
System.out.println("Subtraction is :"+d);
System.out.println("Multi is :"+e);
System.out.println("division is :"+f);
}
}