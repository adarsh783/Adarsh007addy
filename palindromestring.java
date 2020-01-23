import java.util.*;
import java.io.*;
class palindromestring
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter string");
String m1=in.nextLine();
int d=m1.length();
char ct[]=new char[20];
char st[]=new char[20];
for(int i=0;i<d;i++)
{
	ct[i]=m1.charAt(i);
}
for(int i=d-1;i>=0;i--)
{
      st[d-i-1]=ct[i];
   }
    System.out.println(ct);
     System.out.println(st);
   if(String.valueOf(st).equals(String.valueOf(ct)))
   {
   System.out.println("string is palindrome ");
   }
      else
      {
      System.out.println("string is not palindrome ");
   }
     }
 }