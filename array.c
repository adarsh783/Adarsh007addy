#include<stdio.h>
void main()
{
int n,b;
for(n=2;n<=20;n++)
{
	int c=0;
	for(b=2;b<=n/2;b++)
	{
		if(n%b==0)
		{
			c=1;
			printf("number is not prime:%d\n",n);
				break;
		}
}
	 if(c==0)
	{
		printf("number is prime:%d\n",n);
	}
	
}
}


