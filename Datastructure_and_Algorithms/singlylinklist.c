#include<stdio.h>
#include<stdlib.h>
//time 11:52 time to go to sleep.


struct node{
    int data;
    struct node  *next;
};

struct node *head,*newnode,*temp;


void createnode();
void displaynode();
// void insertnode();
// void deletenode();

void main()
{
    int choice;
    do{
        system("COLOR 0");
        printf("\nEnter your choice: \n0 for existing...\n1 for Createnode/createlist...\n2 for insertion\n3 for deletion\n 4 for display...\nPlease enter your choice: ");
        scanf("%d",&choice);

        switch (choice)
        {
        case 1:
            createnode();
            break;

        case 2:
            insertnode();
            break;

        // case 3:
        //     deletenode();
        //     break;
        
        case 4:
            displaynode();
            break;

        default:
            break;
        }
    }while(choice!=0);
}

void createnode()
{
    head=0;
    logic:
        newnode=(struct node *)malloc(sizeof(struct node));
        int data;
        printf("Enter the data to be inserted: ");
        scanf("%d",&data);

        newnode->data=data;
        newnode->next=0;

        if(head==0)
        {
            temp=head=newnode;
        }
        else
        {
            temp->next=newnode;
            temp=newnode;
        }

    int choice;
    printf("Do you want to insert the data again (if yes press 1): ");
    scanf("%d",&choice);

    if(choice==1)
    {
        goto logic;
    }

}

void displaynode()
{
    temp=head;

    while(temp!=NULL)
    {
        printf("%d\n",temp->data);
        temp=temp->next;
    }
}

void insertnode()
{
    newnode=(struct node *)malloc(sizeof(struct node));

    int data;
    printf("Enter the data to be inserted in the linklist: ");
    scanf("%d",&data);

    
}