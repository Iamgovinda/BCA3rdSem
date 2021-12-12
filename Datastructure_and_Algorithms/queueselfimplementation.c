#include<stdio.h>
#define SIZE 5

void enqueue();
void dequeue();
void display();
int isfull();
int isempty();

int peek();

int Queue[SIZE];
int front=-1;
int rear=-1;

int main()
{
    enqueue();
    enqueue();
    enqueue();
    enqueue();
    enqueue();

    dequeue();
    dequeue();
    dequeue();

    display();
    printf("\nThe peek element is %d.",peek());
}

void enqueue()
{
    int x;
    if(isfull())
    {
        printf("Overflow condition!");
    }
    else if(front==-1&&rear==-1)
    {
        rear=front=0;
        printf("Enter the first data to be enqueued:  ");
        scanf("%d",&x);
        Queue[rear]=x;
    }
    else
    {
        rear++;
        printf("Enter the data to be enqueued:  ");
        scanf("%d",&x);
        Queue[rear]=x;
    }
    
}

void dequeue()
{
    if(isempty())
    {
        printf("Underflow condition");
    }
    else
    {
        int temp=Queue[front];
        printf("\nThe dequeued item is %d from the index %d.",temp,front);
        front++;
    }
}

void display()
{
    while(front!=(rear+1))
    {
        printf("\n%d data in %d index",front,Queue[front]);
        front++;
    }
}

int isfull()
{
    if(rear==(SIZE-1))
    {
        return 1;
    }
    return 0;
}

int isempty()
{
    if(front==-1&&rear==-1)
    {
        return 1;
    }
    return 0;
}

int peek()
{
    return Queue[rear];
}


