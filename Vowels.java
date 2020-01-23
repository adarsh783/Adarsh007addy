import java.util.Scanner;
import java.lang.String;
public class Vowels
{
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the value");
String st1 = scan.nextLine();
	System.out.println("Enter the value");
String st2 = scan.nextLine();
	System.out.println("Enter the value");
String st3 = scan.nextLine();
//String st5=st1.replace('a','e','i','o','u','*');
//System.out.println("st5");
for(int i=0;i<st1.length();i++)
{
	char ch=st1.charAt(i);
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'  )
{
System.out.println("#\n");
}
}
for(int j=0;j<st2.length();j++)
{
	char ct=st2.charAt(j);
	//if (!"success".equals(statusCheck))
	if((!"a".equals(ct)) ||(!"e".equals(ct))  || (!"i".equals(ct)) || (!"o".equals(ct)) ||(!"u".equals(ct)))
	{
	System.out.println("@\n");
}
}
String st4=st3.toUpperCase();
	System.out.println(st4);
}
}
