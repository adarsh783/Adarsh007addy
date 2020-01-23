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
	for(j=0;j<size2;j++)
	{
		scanf("%d",&m[j]);
}
    for(i=0;i<size1;i++)
    {
    	for(j=0;j<size2;j++)
    	{
    		if(n[i]<m[j])
    	 	{
    			c[i]=m[j];
    	}
    			else if(n[i]>m[j])
    			{
    				c[i]=n[i];
				}
			}
		}
	printf("print array elements\n");
	for(b=0;b<size1+size2;b++)
	{
		printf("%d\n",c[b]);
}
}
