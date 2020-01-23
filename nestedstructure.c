#include<stdio.h>
struct address
{
	 char city[20];
	 int pin;
	 int phone;
};
struct ad
{
	int num;

};
void display(struct ad,struct address);
void main()
{
	struct ad d;
	struct address a;
	
          printf("enter employee information\n");
          scanf("%d\n%s\n%d\n%d",&d.num,a.city,&a.pin,&a.phone);
          display(d,a);
          
      }
void display(struct ad d,struct address a)
{
	 printf("print employee info\n");
          printf("%d\n%s\n%d\n%d",d.num,a.city,a.pin,a.phone);
}



