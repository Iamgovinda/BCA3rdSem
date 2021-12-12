#include<stdio.h>

struct node{
    int data;
    struct node *next;
};

struct node *head,*newnode,*temp;

void createnode();

void main()
{
    int choice;
    do{
        printf("Enter your choice: ");
        scanf("%d",&choice);

        switch (choice)
        {
        case 1:
            createnode();
            break;

        default:
            break;
        }
    }while(choice!=0);
}
