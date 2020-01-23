#include<stdio.h>
void main()
{
	int i,a[100],f=0,size;
		printf("enter array size");
		scanf("%d",&size);
	printf("enter array elements");
		for(i=0;i<size;i++)
	{
		scanf("%d \n",&a[i]);
}
	for(i=0;i<size;i++)
	{
		f=a[i]+f;
	}
	printf("%d",f);
}
	
