class Wrapper
{
public static void main(String args[])
{
		Integer ob1=new Integer(11);
		Integer ob2=new Integer("12");
		Integer ob3=Integer.valueof(125);
		Integer ob4=126;
		int a=ob1.parseInt();
		int b=ob2.toString();
		int c=ob3.intvalue();
		int d=ob4.intvalue();
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
}
}
