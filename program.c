#include<stdio.h>
void main()
{
	int i,n[20],size,d[20];
	printf("enter array size\n");
	scanf("%d",&size);
	printf("enter array elements\n");
	for(i=0;i<size;i++)
	{
		scanf("%d",&n[i]);
	}
	d[0]=n[0]*n[1];
	for(i=1;i<size;i++)
	{
		d[i]=n[i-1]*n[i+1];
	}
	d[size-1]=n[size-1]*n[size-2];
		printf(" array elements\n");
	for(i=0;i<size;i++)
	{
	       printf("%d\n",d[i]);
	}
}
