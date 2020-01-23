#include<stdio.h>
int main()
{
	char ar[100],rev[100];
	int i,n,flag;
	printf("enter array ");
	scanf("%[^\n]%*c",&ar);
	n=0;
	for(i=0;ar[i]!='\0';i++)
	{
		n++;
	}
	for(i=n-1;i>=0;i--)
	{
		rev[n-i-1]=ar[i];
}
for(i=0;i<n;i++)
{
		flag=0;
		if(ar[i]==rev[i])
		{
			flag=1;
		}
		else 
		{
			flag=0;
			break;
		}
	}
	if(flag==1)
	{
	printf("%s is a palindrome",ar);
}
	else
	{
		printf("%s is not a palindrome",ar);
	}
}

