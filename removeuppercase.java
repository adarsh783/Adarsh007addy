import java.util.*;
import java.io.*;
class removeuppercase
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter string");
String m1=in.nextLine();
String upr="",low="",com;
int d=m1.length();
for(int i=0;i<d;i++)
{
	char ch=m1.charAt(i);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9') )
        {
           low=low+ch;
           }
           else
           {
			   upr=upr+ch;
           }
	   }
           com=upr+low;
           System.out.println(com);
           }
           }

