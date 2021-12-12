#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *next;
};

int main()
{
    struct node *head,*newnode,*temp;
    head=0;

    logic:
        newnode=(struct node *)malloc(sizeof(struct node));

        printf("\n\nEnter the data to be inserted in the node: ");
        scanf("%d",&newnode->data);

        newnode->next=NULL;

        if(head==0)
        {
            head=temp=newnode;
        }
        else{
            temp->next=newnode;
            temp=newnode;
        }

    int choice;
    printf("\n\nEnter do you want to enter data (0,1): ");
    scanf("%d",&choice);

    if(choice==1)
    {
        goto logic;
    }

    temp=head;
    printf("\n\n_____________________________________________________________________________________________________________________");
    printf("\n head: %p",head);
    while(temp!=NULL)
    {
        printf("\t||data:%d/loc:%p||(current location: %p)",temp->data,temp->next,temp);
        temp=temp->next;
    }
    printf("\n_____________________________________________________________________________________________________________________");
      
}
