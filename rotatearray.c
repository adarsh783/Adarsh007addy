#include<stdio.h>
void main()
{
	int i,n[20],size,rotate,temp;
	printf("enter array size\n");
	scanf("%d",&size);
	printf("enter array elements\n");
	for(i=0;i<size;i++)
	{
		scanf("%d",&n[i]);
	}
	printf("enter how many time rotate\n");
	scanf("%d",&rotate);
	while(rotate>0)
	{
		temp=n[0];		
	for(i=0;i<size-1;i++)	
		{
		      n[i]=n[i+1];
		  }
		  n[size-1]=temp;
		      rotate--;
		      
	}
		for(i=0;i<size;i++)
	{
		printf("%d\n",n[i]);
	}
		
	}
	
	

	
	
	
	

