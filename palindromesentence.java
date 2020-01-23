import java.util.*;
import java.io.*;
class palindromesentence
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter string");
String m1=in.nextLine();
String[] m3=m1.split(" ");
int p=m3.length;
//for(int i=0;i<p;i++)
//{
	System.out.println(m3);
//}
String f=" ";
for(int i=p-1;i>=0;i--)
{
	f=f+m3[i]+" ";
}
//System.out.print(f);
char[] a=f.toCharArray();
for(int i=0;i<p;i++)
{
		if(String.valueOf(m3[i]).equals(String.valueOf(a[i])))
		{
		System.out.print("palindrome");
	}
}
//else
//{
//	System.out.print("not palindrome");
//}

}
}

