#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *left,*right;
};

struct node *create(int data)
{
    struct node *node;
    node=(struct node *)malloc(sizeof(struct node));
    node->data=data;
    node->left=NULL;
    node->right=NULL;

    return node;
}

struct node *insertright(struct node *root,int data)
{
    root->right=create(data);
    return root->right;
}

struct node *insertleft(struct node *root,int data)
{
    root->left=create(data);
    return root->left;
}

void display();

int main()
{
    struct node *root;
    root=create(2);

    insertleft(root,4);
    insertright(root,5);
}

void display()
{

}
