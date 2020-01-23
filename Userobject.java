import java.util.*;
class Userobject extends Exception
{
	Userobject(String msg1)
		{
			super(msg1);

	}

public static void main(String args[])
{
	try
	{
String empId;
Scanner in=new Scanner(System.in);
System.out.println("Enter empId");
empId=in.nextLine();
if(empId.length()!=5)
{
	throw new Userobject("Invalid empId");
}
System.out.println("empId is :"+empId);
int salary;
System.out.println("Enter salary");
salary=in.nextInt();
if(salary<=5000)
{
	throw new Userobject("Invalid salary");
}
System.out.println("salary is"+salary);
}
catch(Userobject ob)
{
	System.out.println(ob.getMessage());
	}
}
}
