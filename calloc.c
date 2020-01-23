#include<stdio.h>
#include<stdlib.h>
void main()
{
	int i,n=4,*a;
	a=(int *)calloc(n,sizeof(int));
	if(a== NULL)
	{
      printf("not memory\n");
    }
    else
    {
    	printf("enter array elements\n");
    		for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
          printf("print employee info\n");
          for(i=0;i<n;i++)
          {
          	 printf("%d\n",*(a+i));
		  }
        
	}
}
