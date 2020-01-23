
import java.util.*;
import java.io.*;
class StringTokenizer
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter string");
String m1=in.nextLine();
String[] m3=m1.split(" ");
String[] m4=m1.split(" ");
int ch[]=new int[10];
String low="",upr="",com;
for(int i=0;i<m3.length;i++)
{
ch[i]=1;
}
for(int i=0;i<m3.length;i++)
{
	int g=1;
	for(int j=i+1;j<m4.length;j++)
	{
		if(m3[i].equals(m4[j]))
	{
		g++;
		ch[j]=0;
	//System.out.println(m4[j]+"-"+g);
}
}
if(ch[i]!=0)
{
	//m5=m3[i];
	System.out.println(m3[i]+"-"+g);
}
}
//System.out.print(m.length);
}
}