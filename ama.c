#include<stdio.h>
void main()
{
int arr[10]={2,4,7,3,2,2,2,3,3,3};
int b=0,temp=0,tem=0,c,d,i,j,count=1,e,h=0,sum=0;
int a[10],g[10];
for(c=0;c<10-1;c++)
{
	for (d=0;d<10-c-1;d++)
	{
		if(arr[d]<arr[d+1])
		{
			temp=arr[d];
			arr[d]=arr[d+1];
			arr[d=1]=temp;
		}
	}
}
for(i=0;i<10-1;i=i+count)
{
	 count=1;
	for(j=i+1;j<10-1;j++)
	{
		if(arr[i]==arr[j])
		count++;
		else{
			a[b]=count;
			b++;
			continue;
		}
		
	}
	a[b]=count;
	b++;
}
int max=a[0];
for(c=0;c<b-1;c++)
{
if(a[c]>max)
max=a[c];
}
int com=max;
for(c=0;c<b-1;c++)
{
if(a[c]==max)
{
	e=c;
	while(e<0)
	{
		sum=sum+e;
		e--;
	}
	g[h]=arr[sum];
	h++;
}

}
for(c=0;c<h-1;c++)
{
	for (d=0;d<h-c-1;d++)
	{
		if(g[d]<g[d+1])
		{
			tem=g[d];
			g[d]=g[d+1];
			g[d=1]=tem;
		}
	}
}


printf("%d",arr[0]);
}
