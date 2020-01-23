#include<stdio.h>
void main()
{
	int i,n[20],m[20],c[20],size1,size2;
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
    for(i=0;i<size1+size2;i++)
{
	c[i]=n[i]+m[i];
	}
		for(i=0;i<size1+size2;i++)
	{
		printf("%d\n",c[i]);
}
}
