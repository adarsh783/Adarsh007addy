#include<stdio.h>
#include<stdlib.h>
struct node 
{
    int data;
    struct node *next;
};
struct node * createLinkedList(int n);
void displayList(struct node *head);
int main()
{
    int n=0;
    struct node *head=NULL;
    printf("\n How many nodes:");
    scanf("%d",&n);
    head=createLinkedList(n);
    displayList(head);
    return 0;
}
struct node * createLinkedList(int n)
{
    int i=0;
    struct node *head=NULL;
    struct node *newnode=NULL;
    struct node *temp=NULL;
    for(i=0;i<n;i++)
    {
        newnode=(struct node*)malloc(sizeof(struct node));
        printf("\n enter the data for node number %d:",i+1);
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
void displayList(struct node *head)
{
        struct 	node *temp=head;
        while(temp!=NULL)
        {
            printf("\t%d->",temp->data);
            temp=temp->next;
        }
}
 


 


