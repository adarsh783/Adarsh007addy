#include<stdio.h>
#include<string.h>
int main()
{
	char ch[20];
	int i,temp,size,rotate;
	printf("enter string size");
	scanf("%d",size);
		printf("enter string");
	scanf("%[^\n]%*c",ch);
		printf("enter rotate size");
	scanf("%d",rotate);
	i=0;
	while(rotate>0)
	{
		temp=ch[i];
	for(i=0;i<=size;i++)
	{
		ch[i]=ch[i+1];
			}
			ch[size-1]=ch[i];
			rotate--;
	}
	printf("%c",ch);
	return 0;
}
