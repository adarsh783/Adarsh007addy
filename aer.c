#include<stdio.h>
void main()
{
	int n,c=1;
	printf("enter the number");
	scanf("%d",&n);
	for(int a=1;a<=n;a++)
	{
	c=a*c;
}
printf("final %d",c);
}
