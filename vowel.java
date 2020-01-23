import java.util.Scanner;
class Vowel
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the value");
String s=scan.next();
char ch=scan.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
System.out.println("alphabet is vowel ");
else
System.out.println("alphabet is not vowel ");
}
}