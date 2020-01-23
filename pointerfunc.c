#include<stdio.h>
int add(int *a,int *b)
{
	int c;
	c=*a;
	*a=*b;
	*b=c;
	return *a,*b;
}
int main()
{
	int a=10,b=20;
	int (*p) (int,int);
	p=&add;
	a,b=p(&a,&b);
	printf("%d\n%d",a,b);
	return 0;
}
