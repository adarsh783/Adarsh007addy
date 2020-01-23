import java.util.*;
import java.io.*;
class special
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter string");
String m1=in.nextLine();
String[] m3=m1.split(" ");
String d=" ";
System.out.println("Enter how many times to rotate");
int rotate=in.nextInt();
//int p=m3.length;
while(rotate>0)
{
	d=m3[0];
	for(int i=0;i<m3.length+1;i++)
	{
		m3[i]=m3[i+1];
}
  rotate--;
}
		m3[m3.length+1-1]=d;
System.out.println(m3);
}
}

