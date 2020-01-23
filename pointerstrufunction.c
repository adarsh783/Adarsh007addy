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
void display(struct ad **,struct address **);
void main()
{
	struct ad d;
	struct ad *f=&d;
	struct address a;
	struct address *g=&a;
	
          printf("enter employee information\n");
          scanf("%d\n%s\n%d\n%d",&(*f).num,(*g).city,&g->pin,&(*g).phone);
          //printf("%d\n%s\n%d\n%d",(*f).num,(*g).city,g->pin,(*g).phone);
          display(&f,&g);
          
      }
void display(struct ad **f,struct address **g)
{
	 printf("print employee info\n");
          printf("%d\n%s\n%d\n%d",(**f).num,(**g).city,(**g).pin,(**g).phone);
}


