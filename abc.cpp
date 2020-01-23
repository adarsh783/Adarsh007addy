#include<stdio.h>
int main()
{
	int a[20],b[20],i,j,size,d;
	scanf("%d",&size);
	for(i=0;i<size;i++)
	{
		scanf("%d",&a[i]);
	}
//	scanf("%d",&size);
	for(j=0;j<size;j++)
	{
		scanf("%d",&b[j]);
	}
		for(i=0;i<size;i++)
		{
				for(j=0;j<size;j++)
				{
					if(a[i]==b[j])
					{
						d=a[i];
						printf("%d",a[i]);
					}
				}
		}
		
	
	
	return 0;
}
