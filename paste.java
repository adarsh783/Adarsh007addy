import java.util.Scanner;
class paste
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n;
System.out.println("Enter value between 1 and 3 ");
n=in.nextInt();
switch(n)
{
case 1:System.out.println(" One ");
	break;
case 2:System.out.println(" Two ");
	break;
case 3:System.out.println(" Three ");
	break;
default :System.out.println("wrong number ");
}
}
}