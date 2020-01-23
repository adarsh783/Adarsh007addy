#include<stdio.h>
void main()
{
	int i;
	int a[5]={10,20,30,40,50};
	int* p[5];
	for(i=0;i<5;i++)
	{
		*(p+i)=(a+i);
		printf("%d\n",a[i]);
		
	}
}
