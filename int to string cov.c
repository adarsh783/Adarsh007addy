#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int i,size,ar[20],c=0;
   scanf("%d",&size);
   for(i=0;i<size;i++)
   {
       scanf("%d",&ar[i]);
   }
  for(i=0;i<size;i++)
  {
     c=c+ar[i];
  }
  printf("%d",c);
    return 0;
}
