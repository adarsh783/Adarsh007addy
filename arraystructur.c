#include<stdio.h>
void main()
{
struct Emp
{
	 int eno;
	 char ename[20];
	 float esal[2];
};
	int i,j;
       struct Emp e[3];
           for(i=0;i<3;i++)
 	{ 
  		printf("enter enumber:");
	    		scanf("%d",&e[i].eno);
  		printf("enter ename:");
  				scanf("%s",&e[i].ename);
         for(j=0;j<2;j++)
             {
  	            	printf("enter esal:");
  						scanf("%f",&e[j].esal[j]);
			  }
}
  for(i=0;i<3;i++)
  {
  			printf("\nenumber :%d",e[i].eno);
  				printf("\nename :%s",e[i].ename);
  				for(j=0;j<2;j++)
  				{
  						printf("\nesal :%f",e[j].esal[j]);	
				 
				}
}
 
}
