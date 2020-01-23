#include<stdio.h>
int main()
{
	int a[5]={12,33,14,66,22};
	array(a[5]);
	return 0;
}
int array(int a[5])
{
  int b,l,sl;
  l=a[0];
  sl=a[1];
  for(b=0;b<5;b++)
  {
  	if(a[b]>l)
  	{
  		sl=l;
  		l=a[b];
	  }
	  else if(a[b]>sl)
	  {
	  	sl=a[b];
	  }
}
	  printf("l=%d,sl=%d",l,sl);

	  
	  
}

