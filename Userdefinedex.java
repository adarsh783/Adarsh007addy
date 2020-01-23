import java.util.*;
class Userdefinedex extends Exception
{
public static void main(String args[])
{
	while(true)
	{
	try{
String roll;
Scanner in=new Scanner(System.in);
System.out.println("Enter roll value");
roll=in.nextLine();
if(roll.length()!=10)
{
	throw new Userdefinedex();
}
System.out.println("roll is :"+roll);
break;
}
catch(Userdefinedex ob)
{
	System.out.println("roll is Invalid");
}
}
}
}
