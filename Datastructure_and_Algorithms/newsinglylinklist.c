#include<stdio.h>
#include<stdlib.h>

struct node{
  int data;
  struct node *next;
};

void createnode();
void insertnode();
void deletenode();
void displaynode();
void sortnode();
void searchnode();
void deletefrombeginning();
void deletefromend();
void deletefrommiddle();
void insertfrombeginning(struct node *);
void insertfrommiddle(struct node *);
void insertfromlast(struct node *);


struct node *newnode,*head,*temp;

int main()
{
  int choice;

  do{
  printf("\nEnter your choice>>>\n0 for quit.\n1 for createnode\n 2 for insertnode\n 3 for deletenode\n 4 for displaynode\n 5 for sortnode\n 6 for searchnode\n");
  scanf("%d",&choice);
    switch(choice)
    {
      case 1: createnode();
              break;

      case 2: insertnode();
              break;

      case 3: deletenode();
              break;

      case 4: displaynode();
              break;

      case 5: sortnode();
              break;

      case 6: searchnode();
              break;

      default: exit(0);
    }

  }while(choice!=0);
}

void createnode()
{
  head=NULL;
  newnode=(struct node *)malloc(sizeof(struct node));
  int data;
  printf("Enter the data to be inserted in the node: ");
  scanf("%d",&data);

  newnode->data=data;
  newnode->next=NULL;

  if(head==NULL)
  {
      head=temp=newnode;
  }
  else
  {
      temp->next=newnode;
      temp=newnode;
  }
}

void insertnode()
{
    newnode=(struct node *)malloc(sizeof(struct node));

    printf("Enter the data to be inserted in the linklist: ");
    scanf("%d",&newnode->data);

    int choice;
    printf("Insert node from ?: \n1 from beginning\n 2 from end\n 3 frommiddle:  ");

    switch (choice)
    {
    case 1:
      insertfrombeginning(newnode);
      break;
    case 2: 
      insertfromlast(newnode);
      break;
    case 3:
      insertfrommiddle(newnode);
      break;
    }
}

void deletenode()
{
  int a=2+3;
    printf("d");
}

void displaynode()
{
    printf("\thead:%d");
    temp=head;
    while(temp!=NULL)
    {
        printf("\tdata:%d||next=%p",temp->data,temp->next);
        temp=temp->next;
    }
}

void insertfrombeginning(struct node *)
{
  
}







