#include<stdio.h>
#include<conio.h>
#define size 5

void Enqueue();
void Dequeue();
void peek();    //name[2]
int  Isfull();
int  Isempty();
void Display();

int front=-1,rear=-1;
int queue[size];
void main()
{
    int choice;

    do
    {
        printf("\n\nEnter your choice: \n\n 0 for exit().\n 1 for Enqueue operation. \n 2 for Dequeue operation. \n 3 for peek operation. \n4 for Display:");
        printf("\n\nEnter your choice: ");
        scanf("%d",&choice);

        switch(choice)
        {
            case 1:
            {
                Enqueue();
                break;
            }
            case 2:
            {
                Dequeue();
                break;
            }
            case 3:
            {
                peek();
                break;
            }
            case 4:
            {
                Display();
                break;
            }
        }
    } while (choice!=0);

    
}

void Enqueue()
{
    int x;
    printf("Enter the data: ");
    scanf("%d",&x);

    if(Isfull())
    {
        printf("Overflow condition.");
    }
    else if(front==-1 && rear==-1)
    {
        front=rear=0;
        queue[rear]=x;
    }
    else
    {
        rear++;
        queue[rear]=x;
    }
}


void Dequeue()
{
    if(Isempty())
    {
        printf("Underflow condition.");
    }
    else
    {
        int temp=queue[front];
        front++;
        printf("Dequeued item is %d.",temp);
    }
}


void Display()
{
    for(int i=front;i<=rear;i++)
    {
        printf("\t%d",queue[i]);
    }
}

void peek()  //peek operation returns the peek value of the queue which is in front.
{
    printf("%d is the peek value of queue.",queue[front]);
}

int Isfull()
{
    if(rear==size-1)
    {
        return 1;
    }
    return 0;
}

int  Isempty()
{
    if(front>rear)
    {
        return 1;
    }
    return 0;
}