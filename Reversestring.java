import java.util.*;
import java.lang.*;
class Reversestring
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter string");
String m1=in.nextLine();
int d=m1.length();
char st[]=new char[m1.length()];
char ct[]=new char[m1.length()];
for(int i=0;i<d;i++)
{
	ct[i]=m1.charAt(i);
		//System.out.println(ct[i]);
  }
for(int i=d-1;i>=0;i--)
{
      st[d-i-1]=ct[i];
  }
  for(int i=0;i<d;i++)
  {
	System.out.println(st[i]);
}
}
}




