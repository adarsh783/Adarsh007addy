#include<stdio.h>
void main()
{
	int ar[100],f[40],n,location,i,j,k;
	printf("enter element");
	scanf("%d",&n);
//	printf("enter location");
//	scanf("%d",location);
   k=0;
	while(n>0)
	{
		i=n%10;
		  ar[k]=i;
		  k++;	
		  n=n/10;
	}
	for(i=k-1;i>=0;i--)
	{
	    f[k-i-1]=ar[i];
	}
	for(i=0;i<k;i++)
{
	printf("number %d\n",f[i]);
	}
}
