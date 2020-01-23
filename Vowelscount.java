import java.util.Scanner;
import java.lang.String;
class Vowelscount
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter string");
String m1=in.nextLine();
int d=0,e=0,f=0,s=0,g=0;
for(int i=0;i<m1.length();i++)
{
     char ch=m1.charAt(i);
     //ch=character.toUppercase(ch);
     if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
     {
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
	{
	d++;
	}
	else
	{
		e++;
	}
}
	else if('0'<=m1.charAt(i) && m1.charAt(i)<='9')
	{
	f++;
	}
	else if(m1.charAt(i)==' ')
	{
	s++;
	}
	else
	{
	g++;
	}
	}
	System.out.println("vowels is "+d);
	System.out.println("constant is "+e);
	System.out.println("digit is "+f);
	System.out.println("space is "+s);
	System.out.println("special character is "+g);
	}
	}

