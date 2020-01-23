import java.util.*;
import java.io.*;
import java.io.*;
class firstrepetedchar
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter string");
String m1=in.nextLine();
int d=m1.length();
char ct[]=new char[20];
for(int i=0;i<d;i++)
{
	ct[i]=m1.charAt(i);
}
  for(int i=0;i<d;i++)
  {
     for(int j=i+1;j<d;j++)
  {
      if(ct[i]==ct[j])
      {
		break;
      }
       }
   }
  	System.out.println(ct);

}
}