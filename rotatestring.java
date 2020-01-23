import java.util.*;
import java.io.*;
class rotatestring
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter string");
String m1=in.nextLine();
System.out.println("enter times to rotate ");
int rotate=in.nextInt();
int d=m1.length();
char ct[]=new char[10];
for(int i=0;i<d;i++)
{
	ct[i]=m1.charAt(i);
}
while(rotate>0)
{
   char p=ct[d-1];
for(int i=d-1;i>0;i--)
   {
    ct[i]=ct[i-1];
    }
    ct[0]=p;
    rotate--;
    }
    for(int i=0;i<d;i++)
    {
    	System.out.println(ct[i]);
    }
    }
}




