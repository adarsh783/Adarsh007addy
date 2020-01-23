
class Enuexample
{
	enum Week
	{
	Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;
}
public static void main(String[] args)
{
Week ob=Week.Sunday;
System.out.println(ob+"...."+ob.ordinal());
}
}