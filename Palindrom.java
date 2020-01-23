import java.util.Scanner;
class Palindrom
{
void palin()
{
int a,d=0,f,flag;
Scanner in=new Scanner(System.in);
System.out.println("Enter a value :");
a=in.nextInt();
f=a;
while(a>0)
{
flag=a%10;
d=flag*flag*flag+d;
a=a/10;
}
if(d==f)
{
	System.out.println("palindrome number :"+f);
}
	else
	{
		System.out.println("not palindrome number :"+f);

}
}
public static void main(String args[])
{
Palindrom in=new Palindrom();
in.palin();
}
}
