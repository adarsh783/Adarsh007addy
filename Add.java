import java.util.Scanner;
class Sample
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
int a,b,c;
System.out.println("Enter a,b,c values :");
a=input.nextInt();
b=input.nextInt();
c=a+b;
System.out.println("c value :"+c);
c=a-b;
System.out.println("c value :"+c);
c=a*b;
System.out.println("c value :"+c);
c=a/b;
System.out.println("c value :"+c);
}
}