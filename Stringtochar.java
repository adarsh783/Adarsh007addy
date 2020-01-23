import java.util.*;
import java.lang.*;
class Stringtochar
{
public static void main(String args[])
{
	int d=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter string");
String m1=in.nextLine();
System.out.println("Enter character to check");
char ch=in.next().charAt(0);
for(int i=0;i<m1.length();i++)
{
	char c=m1.charAt(i);
	if(ch==c)
{
  d++;
  }
  }
   System.out.println("occurance of that character is:"+d);
}
}