#include<stdio.h>
int main()
{
	int i,j,ar[100],temp,size,n;
	printf("enter array size");
	scanf("%d",&size);
	printf("enter array");
	for(i=0;i<size;i++)
	{
	scanf("%d",&ar[i]);
}
	for(i=0;i<size/2;i++)
	{
		for(j=0;j<size/2;j++)
		{
			if(ar[i]<ar[j])
			{
				temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
	}
	for(i=size/2;i<size;i++)
	{
		for(j=size/2;j<size;j++)
		{
			if(ar[i]>ar[j])
			{
				temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
	}
		printf("ascending order");	
	for(i=0;i<size/2;i++)
	{
	printf("%d\n",ar[i]);
}
	printf("dscending order");	
	for(i=size/2;i<size;i++)
	{
	printf("%d\n",ar[i]);
}
	
}
