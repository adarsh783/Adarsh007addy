#include<stdio.h>
int main()
{
	int number;
	printf("enter your number\n",number);
	scanf("%d",&number);
    
	if(number>=90 && number<=100)
    printf("grade a");
    
    else if(number>=60 && number<90)
    printf("b grade ");
    
    else if(number>=40 && number<60)
    printf("grade is c");
    
		else
	printf("fail");
	return 0;
}
