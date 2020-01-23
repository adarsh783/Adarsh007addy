import java.util.Scanner;
class whileloop
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a,n;
System.out.println("Enter n value :");
n=in.nextInt();
a=1;
while(a<=10){
	System.out.print(a+ "*" +n+ "=" );
	System.out.println(a*n);
	a++;
	}
	}
	}