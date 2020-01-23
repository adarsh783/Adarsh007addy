#include<stdio.h>
void main()
{
	int i,n[20],m[20],c[20],size1,size2,temp,j,b;
	printf("enter array size\n");
	scanf("%d",&size1);
	printf("enter array elements\n");
	for(i=0;i<size1;i++)
	{
		scanf("%d",&n[i]);
}
	printf("enter array size\n");
	scanf("%d",&size2);
	printf("enter array elements\n");
	for(i=0;i<size2;i++)
	{
		scanf("%d",&m[i]);
}
    for(i=0;i<size1;i++)
{
	c[i]=n[i];
	}
	int a=0;
	for(i=size1;i<size1+size2;i++)


	{
		c[i]=m[a++];
	}
	{
	for(j=i+1;j<size1+size2;j++)
		{
		temp=c[i];			c[i]=c[j];
		c[j]=temp;
		}	}
	}
	printf("enter array elements\n");
	for(i=0;i<size1+size2;i++)
	{
		printf("%d\n",c[i]);
}
