#include<stdio.h>
struct address
{
	 char city[20];
	 int pin;
	 int phone;
};
void main()
{
	struct address* p;
	p=(struct address*)malloc(sizeof(struct address));
	if(p== NULL)
	{
        printf("out of memory error\n");
    }
    else
    {
          printf("enter employee info\n");
             scanf("%s\n%d\n%d",p->city,&p->pin,&p->phone);	
             printf("%s\n%d\n%d",p->city,&p->pin,&p->phone);
	}
}
