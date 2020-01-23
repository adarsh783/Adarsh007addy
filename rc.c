#include<stdio.h>
int main()
{
int t;
scanf("%d",&t);
while(t!=0)
{
t--;
int x,y,i;
scanf("%d%d",&x,&y);
for(i=0;i<y;i++)
{
if(((2*i)+(y-i))==x)
{
printf("%d",i);
}
}
}
return 0;
}