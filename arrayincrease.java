void main()
{
	int i,n[20],size,rotate,temp;
	printf("enter array size\n");
	scanf("%d",&size);
	printf("enter array elements\n");
	for(i=0;i<size;i++)
	{
		scanf("%d",&n[i]);
}
	for(i=0;i<size;i++)
	{
		for(j=i+1;j<size;j++)
	{
	    if(n[i]>n[j])
	{
		temp=n[i];
		n[i]=n[j];
		n[j]=temp;
	}
}
}
printf("enter array elements\n");
	for(i=0;i<size;i++)
	{
		scanf("%d",&n[i]);
}
}

