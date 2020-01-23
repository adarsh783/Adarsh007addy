#include<stdio.h>
struct Emp
{
	 int eno;
	 char enamw[20];
	 float esal;
};
void main()
{
  struct Emp e={102,"adarsh",50000};
  printf("emp details:%d\n%s\n%f",e.eno,e.enamw,e.esal);	
}
