
#include<stdio.h>
void main()
{
	int i,n[20],size,g,j,d[20];
	printf("enter array size\n");
	scanf("%d",&size);
	printf("enter array elements\n");
	for(i=0;i<size;i++)
	{
		scanf("%d",&n[i]);
		d[i]=1;
	}
	printf("occurance of each elements are\n");
	for(i=0;i<size;i++)
	{
		g=1;
		for(j=i+1;j<size;j++)
		{
			if(n[i]==n[j])
			{
				g++;
				d[j]=0;
			}
			}
			if(d[i]!=0)
			{
				d[i]=g;
			}
		}
		for(i=0;i<size;i++)
		{
			if(d[i]!=0)
			{
		printf("%d-%d\n",n[i],d[i]);
}
}
}
