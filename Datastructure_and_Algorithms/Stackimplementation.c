#include<stdio.h>
#include<conio.h>
#define size 10

                                                                                // Stack operations in c is given as follows:
                                                                                /*
                                                                                push()
                                                                                pop()
                                                                                peek()
                                                                                display()
                                                                                */

void push(); //This function is used for pushing the data in stack.
void pop();  // This function is used for popping the data from stack.
void peek(); // This function shows the peek value of the stack.
void display(); // Displays all the elements.
int isfull();
int isempty();
int top=-1;
int stack[size]; //array declaration

void main()
{
    int choice;

    do
    {
        printf("\n\n\nEnter your choice: \n 0 for Exit().\n 1 for push.\n 2 for pop.\n 3 for peek.\n 4 for display.");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:
            {
                push();
                break;
            }
            case 2:
            {
                pop();
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
        }
    } while (choice!=0);
       
} 

void push()// does the push operation on stack structure.
{
    int x;
    printf("Enter the data: ");  //5
    scanf("%d",&x);

    if(isfull())  //9
    {
        printf("\n\nOverflow condition.");
    }
    else{
        top++;  //toop=-1  top>>>0 //array[0]=12// -1
        stack[top]=x;
    }
}

void pop()
{
    if(isempty())
    {
        printf("\n\nUnderflow condition.");
    }
    else
    {
        int item;
        item=stack[top];
        top--;
        printf("\nPoped item is %d.",item);
    }
}

void display()
{
    if(isempty())
    {
        printf("\n\n\nThe stack is empty.");
    }
    else
    {
        int i;
        for(i=top;i>=0;i--)
        {
            printf("\n\n%d in %d index.\t\t\t",stack[i],i);
        }
    }

}

void peek()
{
    printf("\n\nThe peek value of the stack is %d in %d index.",stack[top],top);
}

int isfull()
{
    if(top==size-1)
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
