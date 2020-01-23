class Incr
{
int item;
public static void main(String args[])
{
Incr obj1=new Incr();
Incr obj2=new Incr();
obj1.item=10;
obj2.item= obj2.Name(obj1.item);
System.out.println(obj1.item+"    "+ obj2.item);
}

int Name(int a)
{

  a= a+10;
  return a;
 }

}