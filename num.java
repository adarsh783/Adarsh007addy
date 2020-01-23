import java.util.Scanner;
class num
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
int id;
String name,job;
double bs,hra,ta,pf,pt,et,gs,ns;
System.out.println("Ehsgvnter employee id,name,job and basic salary details :");
id=input.nextInt();
name=input.next();
job=input.next();
bs=input.nextDouble();
hra=bs*(40/100);
ta=bs*(20/100);
pf=bs*(15/100);
pt=bs*(10/100);
et=bs*(4/100);
gs=(bs+hra+ta+et);
ns=(gs-pf-pt);
System.out.printf("Gross pay :% .2f\n",+gs);
System.out.printf("Net pay :% .2f\n",+ns);
}
}