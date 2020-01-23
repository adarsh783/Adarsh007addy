import java.util.Scanner;
class Load
{
public static void main(String args[])
{
String n;
System.out.println("Enter n value");
Scanner scan=new Scanner(System.in);
n=scan.next();
if(n.equals("default")|| n.equals("case") || n.equals("while") || n.equals("switch"))
System.out.println(n+"is a keyword");
else
System.out.println(n+"not a keyword");
}
}