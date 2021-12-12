#include<stdio.h>
#define size 5

int stack[size];

int top=-1;

void push();
void pop();
void display();
int isfull();
int isempty();
int peek();

int main()
{
    push();
    push();
    push();
    push();
    push();
    pop();
    pop();
    display();
    peek();
}

void push()
{
    int x;

    if(isfull())
    {
        printf("Overflow condition.");
    }
    top++;
    printf("Enter the data to be pushed to the stack: ");
    scanf("%d",&x);

    stack[top]=x;
}

void pop()
{
    if(isempty())
    {
        printf("Underflow condition!");
    }
    int temp=stack[top];
    printf("\nThe poped item is %d! from index %d!",temp,top);
    top--;

}
int isfull()
{
    if(top==(size-1))
    {
        return 1;
    }
    return 0;
}

int isempty()
{
    if(top==-1)
    {
        return 1;
    }
    return 0;
}

void display()
{
    int i=top;
    for(i;i>=0;i--)
    {
        printf("\n%d",stack[i]);
    }
}

int  peek()
{
    if(isempty())
    {
        printf("There is no element in the stack!");
    }
    return stack[top];
}