import java.util.Scanner;
class positive
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a;
System.out.println("Enter a value :");
a=in.nextInt();
if(a>0)
{
	System.out.println("positive number : "+a);
}
	else
	{
		System.out.println("negative number : "+a);
}
  }
   }