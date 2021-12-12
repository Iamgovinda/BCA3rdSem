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
void insertnode();
void deletenode();

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

        case 3:
            deletenode();
            break;
        
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
    printf("\n\nDo you want to insert data again?(1 for yes): ");
    scanf("%d",&choice);

    if(choice==1)
    {
        goto logic;
    }

}


void displaynode()
{
    system("COLOR 4F");
    temp=head;
    
    printf("\n\n_______________________________________________________________________");
    printf("\n\nhead: %p",head);
    while(temp!=NULL)
    {
        printf("\n%d in loc:%p||next:%p",(*temp).data,temp,temp->next);
        temp=temp->next;
    }
    printf("\n_______________________________________________________________________");
}


void insertnode()
{
    logic:
        newnode=(struct node *)malloc(sizeof(struct node));

        printf("\n\nEnter the data to be inserted in the node: ");
        scanf("%d",&newnode->data);

        newnode->next=NULL;

        temp=head;
        while(temp->next!=NULL)
        {
            temp=temp->next;
        }
        temp->next=newnode;

    int choice;
    printf("\n\nDo you want to insert data again?(1 for yes): ");
    scanf("%d",&choice);

    if(choice==1)
    {
        goto logic;
    }


}

void deletenode()
{
    temp=head;
    int dtbd; //data to be deleted!
    printf("please Enter the data to be deleted: ");
    scanf("%d",&dtbd);
    struct node *prevnode;

    while(temp->data!=dtbd)  //reach till the node having data to be deleted!
    {
        prevnode=temp;       //storing the temp variable in another variable prevnode so that we could access previous node while changing the location!
        temp=temp->next;
    }
    prevnode->next=temp->next;
    free(temp);

}

