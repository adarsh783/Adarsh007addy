import java.util.*;
import java.lang.*;
class Occuranceofchar
{
public static void main(String args[])
{
	int d;
Scanner in=new Scanner(System.in);
System.out.println("Enter string");
String m1=in.nextLine();
int st[]=new int[m1.length()];
for(int i=0;i<m1.length();i++)
{
	st[i]=m1.charAt(i);
	st[i]=1;
}
for(int i=0;i<m1.length();i++)
{
	d=1;
	char ch=m1.charAt(i);
	for(int j=i+1;j<m1.length();j++)
	{
		char cj=m1.charAt(j);
	if(ch==cj)
{
  d++;
  st[j]=0;
  }
}
if(st[i]!=0)
{
	st[i]=d;
	System.out.println(ch+ " :- "+d);
}
}
}
}

