import java.util.Scanner;
class inter
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
int a,b;
System.out.println("Enter a,b values:");
a=input.nextInt();
b=input.nextInt();
a=a^b;
b=a^b;
a=a^b;
System.out.println("After swapping : "+a+ "and" +b);
}
}