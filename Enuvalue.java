class Enuvalue
{
	enum Week
	{
	Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;
}
public static void main(String[] args)
{
Week[] ob=Week.values();
for(Week b1:ob)
System.out.println(b1+"....."+b1.ordinal());
}
}