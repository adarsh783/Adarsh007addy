#include<stdio.h>
void main()
{
	int a=100;
	int *p,**p1;
	p=&a;
	p1=&p;
	printf("%u\n%u",p,&a);
}
