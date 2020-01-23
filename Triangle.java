import java.util.Scanner;
class Triangle
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter string");
String m1=in.nextLine();
for(int i=1;i<m1.length();i++)
{
		String m2=m1.substring(0,i);
	System.out.println(m2);
	}
	}
}
