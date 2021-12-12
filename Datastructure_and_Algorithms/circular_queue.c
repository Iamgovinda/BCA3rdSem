//circular queue is the datastructure which reduces the draw back of linear queue[The deletion would be from front and after the deletion some space will be there as waste.
//and we cannot insert element there .The circular queue avoid that drawback.......]

#include<stdio.h>
#include<conio.h>
#define size 5


void enqueue();
void dequeue();
void peek();
void display();

int front=-1;
int rear=-1;
int queue[size];

void main()
{
    int choice;

    do{
        printf("\n\nEnter your choice...........\n 0 for exit.\n1 for enqueue operation.\n2 for dequeue operation.\n3 for peek operation.\n4 for display.\nEnter your choice: ");
        scanf("%d",&choice);
        switch (choice){
        case 1:
        {
            enqueue();
            break;
        }
        case 2:
        {
            dequeue();
            break;
        }
        case 3:
        {
            peek();
            break;
        }
        case 4:
        {
            display();
            break;
        }
        default:
        {
            printf("\n\nInvalid input.");
            break;
        }
        }
    }while(choice!=0);
}

void enqueue()
{
    int data;
    printf("Enter the data: ");
    scanf("%d",&data);

    if ((rear+1)%size==front)
    {
        printf("\n\nOverflow condition.");
    }
    else if(front==-1 && rear==-1)
    {
        rear=front=0;
        queue[rear]=data;
    }
    else
    {
        rear=(rear+1)%size;
        queue[rear]=data;
    }

}

void dequeue()
{
    if(front==-1&&rear==-1)
    {
        printf("\n\nUnderflow condition.");
    }
    else if(front==rear)
    {
        printf("\n\nThe dequeued item is %d",queue[front]);
        front=rear=-1;
    }
    else
    {
        printf("\n\nThe dequeued item is %d",queue[front]);
        front=(front+1)%size;
    }
}

void peek()
{
    printf("\n\nThe peek item is %d.",queue[front]);
}

void display()
{
    int i=front;
    printf("\n\n\t\t**************Circular__Queue****************\n");
    printf("_______________________________________________________________________________\n");

    while(i!=rear)
    {
        if(front==-1&&rear==-1)
        {
            printf("Queue is empty.");
        }
        else 
        {
            printf("%d in index %d\t",queue[i],i);
        }
        i=(i+1)%size;
    }
    printf("%d in index %d",queue[rear],i);
    printf("\n_______________________________________________________________________________\n");
}