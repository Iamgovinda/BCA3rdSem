#include<stdio.h>
#include<stdlib.h>


typedef struct node{
    struct node *prev;
    int data;
    struct node *next;
}linklist;

linklist *newnode,*head,*temp;

void createnode();
void displaynode();
void deletenode();

void main()
{
    int choice;

    do{
        printf("\n\n\nEnter 0 for exist.\n\n1 for createnode.\n\n2 for show the node.\n\n3 for deletenode.\n\nEnter your choice: ");
        scanf("%d",&choice);

        switch(choice)
        {
            case 1:
                createnode();
                break;
            
            case 2:
                displaynode();
                break;
            case 3:
                deletenode();
                break;

            default:
                exit(0);
        }

    }while(choice!=0);
    
}

void createnode()
{
    head=0;

    logic:
    newnode=(linklist *)malloc(sizeof(linklist));

    printf("\nEnter the data to be inserted in the list: ");
    scanf("%d",&newnode->data);

    newnode->next=NULL;

    if(head==0)
    {
        head=temp=newnode;
        newnode->prev=head;
    }
    else
    {
        temp->next=newnode;
        temp=newnode;
        temp->prev=newnode;
    }

    int choice;
    printf("Do you want to enter the data again(1 for yes/any key to reject): ");
    scanf("%d",&choice);\

    if (choice==1)
    {
        goto logic;

    }


}


void displaynode()
{
    temp=head;
    printf("\n\n________________________________________________________________________________\n");
    printf("head: %d",head);
    while(temp!=NULL)
    {
        printf("\n||prev:%d||data:%d||next:%d||",temp->prev,temp->data,temp->next);
        temp=temp->next;
    }
    printf("\n\n________________________________________________________________________________\n");
}

void deletenode()
{
    int dtbd;
    printf("Enter the data to be deleted: ");
    scanf("%d",&dtbd);

    linklist *nextnode,*prevnode;

    temp=head;

    while(temp->data!=dtbd)
    {

        nextnode=(temp->next)->next;
        prevnode=temp;
        temp=temp->next;

    }

    prevnode->next=nextnode->prev;
    nextnode->prev=temp->prev;
    free(temp);


}
