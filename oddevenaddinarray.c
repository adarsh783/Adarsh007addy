#include<stdio.h>
int main()
{
	int n,i,j=0,k=0,size;
	printf("enter array elements");
	scanf("%d",&n);
	while(n>0)
	{
		i=n%10;
		if(i%2==0)
		{
			j=j+i;
		}
		else
		{
			k=k+i;
		}
	n=n/10;
}
	printf("add %d",j);
	printf("sun %d",k);
	if(j>k)
	{
		j=j-k;
		printf("greater j %d",j);
	}
		else
		{
			k=k-j;
			printf("smaller is j %d",k);
		}
	
}
	
