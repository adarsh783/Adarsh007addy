#include<stdio.h>
#include<string.h>
char* substring(char *ch,int l,int u,char *che)
{
	int i,j,n,size=u-l;
	//char temp[size];
	int k=0;
	for(i=l;i<=u;i++)
	{
		che[k++]=ch[i];
	}
	printf("%s",che);	
	return che;
}
int main()
{
		char ch[20];
		//char *che;
	int l,u;
printf("enter string ");
		scanf("%[^\n]%*c",ch);
		printf("enter lower  range");
	scanf("%d",&l);
		printf("enter upper range");
	scanf("%d",&u);
	printf("%d",u-l+1);
	char che[u-l+1];
	     substring(ch,l,u,che);
	      //printf("%s\n",che);
	      return 0;
}
