import java.util.Scanner;
class salary
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int id;
String name,job;
double bs,hra,ta,pf,pt,et,gs,ns;
System.out.println("Enter id,name,job,bs,hra,ta,pf,pt,et,gs,ns ");
id=scan.nextInt();
name=scan.next();
job=scan.next();
bs=scan.nextDouble();
hra=scan.nextDouble();
ta=scan.nextDouble();
pf=scan.nextDouble();
pt=scan.nextDouble();
et=scan.nextDouble();
gs=scan.nextDouble();
ns=scan.nextDouble();
hra=(bs*40/100);
ta=(bs*20/100);
pf=(bs*0.15);
pt=(bs*0.1);
et=(bs*0.04);
gs=(bs+hra+ta+et);
ns=(gs-pf-pt);
System.out.printf("GrossPay :%.2f\n ",gs);
System.out.printf("NetPay :%.2f\n ",ns);
}
}