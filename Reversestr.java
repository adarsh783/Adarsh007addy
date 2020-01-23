import java.util.Scanner;
class Reversestr
{
public static void main(String args[])
{
String n,r="";
System.out.println("Enter string ");
Scanner in=new Scanner(System.in);
n=in.nextLine();
int d=n.length();
for(int i=d-1;i>=0;i--)
{
	r=r+n.charAt(i);
}
System.out.println("reverse string "+r
);

}
}