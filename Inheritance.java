class A
{
    void m1()
    {
    System.out.println("nothing ");
    }
    }
    class B extends A
    {
    		 void m2()
		    {
		    System.out.println("sothing ");
		    }
    }
    		class C extends B
    			{
    		 void m3()
		    {
		    System.out.println("tothing ");
		    }
    }
    class Inheritance
    {
    public static void main(String args[])
    {
    C in=new C();
    in.m1();
    in.m2();
    in.m3();
    }
    }
