import java.util.Scanner;
class rectangle
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int width,length;
double area;
System.out.println("Enter value of width,length ");
width=scan.nextInt();
length=scan.nextInt();
area=(width*length);
System.out.println("The area of rectangle :"+area);
}
}