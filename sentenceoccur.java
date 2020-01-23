import java.util.*;
import java.io.*;
class sentenceoccur
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter sentence");
String m1=in.nextLine();
String[] m3=m1.split(" ");
int p=m3.length;
for(int i=0;i<p;i++)
{
	for(int j=i+1;j<p;j++)
	{
		int count=1;
		if(m3[i]==m3[j])
		{
			count++;
			m3[j]="0";
		}
		else
		{
			m3[i]="count";
		}
	}

}
for(int i=0;i<p;i++)
{
	System.out.println(m3[i]+":-"+count);
}
}
}



