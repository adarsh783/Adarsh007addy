import java.util.Scanner;
class Occurance
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter string");
String m1=in.nextLine();
System.out.println("Enter character");
char c=in.next().charAt(0);
int d=0;
for(int i=0;i<m1.length();i++)
{
	if((m1.charAt(i)==(c)) || (c==(Character.toUpperCase(m1.charAt(i)))) || (c==(Character.toLowerCase(m1.charAt(i)))))
	{
	d++;
	}
	}
	if(d!=0)
	{
	System.out.println("Occur "+d);
	}
	else
	{
	System.out.println("not character"+d);
	}
	}
}