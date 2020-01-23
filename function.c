#include<stdio.h>
int adarsh();
void main()
{
	int a,b;
	printf("enter a,b");
	scanf("%d\n%d",&a,&b);
	adarsh(&a,&b);
	printf("%d\n%d",a,b);
}
int adarsh(int *a,int *b)
{
	int c;		
	c=*a;
	*a=*b;
	*b=c;
	return *a,*b;
}
