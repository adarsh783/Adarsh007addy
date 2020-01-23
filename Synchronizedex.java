import java.util.Scanner;
 class Account
{
private int bal;
public Account(int bal)
{
this.bal=bal;
}
public boolean isSufficientBalance(int w)
{
	if(bal>w)
	return(true);
	else
	return(false);
	}
public void withdraw(int amt)
{
bal=bal-amt;
System.out.println("withdrwl money is "+amt);
System.out.println("your current balance is "+bal);
}
}
class Customer implements Runnable
{
private String name;
private Account account;
public Customer(Account account,String n)
{
this.account=account;
this.name=n;
}
public void run()
{
Scanner in=new Scanner(System.in);
synchronized(account)
{
System.out.println(name+",Enter amount to withdrwl ");
int amt=in.nextInt();
if(account.isSufficientBalance(amt))
{
System.out.println(name);
account.withdraw(amt);
}
else
System.out.println("Insufficient balance ");
}
}
}
public class Synchronizedex
{
public static void main(String args[])
{
Account a1=new Account(1000);
Customer c1=new Customer(a1,"raj"),c2=new Customer(a1,"puja");
Thread t1=new Thread(c1);
Thread t2=new Thread(c2);
t1.start();
t2.start();
}
}
















