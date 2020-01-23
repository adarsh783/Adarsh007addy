import java.util.*;
class Exceptiontry
{
public static void main(String args[])
{
	while(true)
	{
	try{
int x;
Scanner in=new Scanner(System.in);
System.out.println("Enter X value");
x=in.nextInt();
int n=44/x;
System.out.println("divide is :"+n);
break;
}
catch(Exception a)
{
	System.out.println("only integer valuee is allowed");
}
finally
{
System.out.println("system is ");
}
}
}
}
