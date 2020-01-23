#include<stdio.h>
void main()
{
	char name[20]="adarshiskuch";
	int count=0,i;
	for(i=0;i<13;i++)
	{
		//count=0;
		if(name[i]=='a' ||name[i]=='e' ||name[i]=='i' ||name[i]=='o' ||name[i]=='u')
		{
			count++;
		}
	}
	
	printf("the name is %d",count);
}
