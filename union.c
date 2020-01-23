#include<stdio.h>
union Emp
{
	 
	 int b;
	 float esal;
	 int a;
}h;
void main()
{
  h.b=10;
 // printf("eno details:%d",h.eno);
  h.esal=30000.00;
  //printf("ename deatails:%f",h.esal);
 // h.esal=30000;
  	
  h.a=7600;
  printf("b:%d\n",h.b);
  printf("esal:%f\n",h.esal);	
  printf("a:%d\n",h.a);
}
