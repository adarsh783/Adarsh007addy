#include<stdio.h>
#include<stdlib.h>
struct node
{
	int data;
	struct node *next;
};
struct node * createlinkedlist(int n);
void displaylinklist(struct node *head);
struct node * Insertnewnode();
struct node * Insertendnode();
struct node * Insertnodeafter();
int main()
{
	int n=0;
	struct node *head=NULL;
	printf("enter number of node");
	scanf("%d",&n);
	head=createlinkedlist(n);
	head=Insertnewnode(head);
    head=Insertendnode(head);
    head=Insertnodeafter(head,n);
	displaylinklist(head);
	return 0;
}
struct node * createlinkedlist(int n)
{
	int i=0;
	struct node *head=NULL;
	struct node *newnode=NULL;
	struct node *temp=NULL;
	for(i=0;i<n;i++)
	{
			newnode=(struct node*)malloc(sizeof(struct node));
		printf("\nenter data :",i+1);
		scanf("%d",&(newnode->data));
		newnode->next=NULL;
			if(head==NULL)
			{
				head=newnode;
			}
			else
			{
				temp=head;
					while(temp->next!=NULL)
			   temp=temp->next;
			   temp->next=newnode;	
			}
	}
	return head;
	
}
struct node * Insertnewnode(struct node *head)
{
	int n=0,i=0;
	struct node *newnode;
	printf("\n number of times insert at beginning ->");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		newnode=(struct node*)malloc(sizeof(struct node));
			printf("\nenter data :",i+1);
		scanf("%d",&(newnode->data));
		newnode->next=head;
		head=newnode;
	}
		return head;
}
 struct node * Insertendnode(struct node *head)
 {
	int n,i;
	struct node *newnode,*temp;
   printf("\n number of times insert end node ->");
   scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		newnode=(struct node*)malloc(sizeof(struct node));
			printf("\nenter data at end :",i+1);
		scanf("%d",&(newnode->data));
		newnode->next=NULL;
		while(temp->next!=NULL)
		{
			temp=temp->next;
		}
		temp->next=newnode;
}
		return head;
} 
 struct node * Insertnodeafter(struct node *head)
 {
	int i=1,t,position,f;
	struct node *newnode,*temp;
	printf("\n node to insert after which position ->");
   scanf("%d",&position);
   printf("\n number of  node to insert ->");
    scanf("%d",&t);
	 	temp=head;
	 	while(i<position)
	 	{
	 		temp=temp->next;
	 		i++;
		 }
	for(f=0;f<t;f++)
	{
		newnode=(struct node*)malloc(sizeof(struct node));
			printf("\nenter data  :");
		scanf("%d",&(newnode->data));
	newnode->next=temp->next;
	temp->next=newnode;
}
		return head;
} 
void displaylinklist(struct node *head)
{
	struct node *temp=head;
	while(temp!=NULL)
	{
     printf("%d->",temp->data);
	 temp=temp->next;	
}
}


