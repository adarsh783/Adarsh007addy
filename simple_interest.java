import java.util.Scanner;
class simple_Interest
{
public static void main(String[] args)
{
	Scanner input=new Scanner(System.in);
	float p,r,t,si;
	System.out.println("Enter principal : ");
	p=input.nextFloat();
	System.out.println("Enter rate of interest : ");
	r=input.nextFloat();
	System.out.println("Enter time : ");
	t=input.nextFloat();
	si=(p*r*t)/100;
	System.out.println("Simple Interest is : "+si);
}
}