import java.util.Scanner;
class ascii
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter string");
String m1=in.nextLine();
char ch=in.next().charAt(0);
if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
{
	int ascii=ch;
System.out.println(" ascii value is "+ascii);
}
}
}