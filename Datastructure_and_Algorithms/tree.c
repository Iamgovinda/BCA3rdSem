#include<stdio.h>
#include<stdlib.h>


struct node{
    int data;
    struct node *left;
    struct node *right;
};

struct node *create(int data)
{
    struct node *node=(struct node *)malloc(sizeof(struct node));

    node->data=data;
    node->left=NULL;
    node->right=NULL;

    return node;
}

struct node *insertleft(struct node *root,int data)  //fuction to insert the element to the right side of the tree
{
    root->right=create(data);
    return root->right;
}

struct node *insertright(struct node *root,int data)  //fuction to insert the element to the left side of the tree
{
    root->left=create(data);
    return root->left;
}

void preordertraversal(struct node *root)
{
    if(root==NULL) return;
    printf("%d->",root->data);
    preordertraversal(root->left);
    preordertraversal(root->right);
}

void inordertraversal(struct node *root)
{
    if(root==NULL) return;
    inordertraversal(root->left);
    printf("%d->",root->data);
    inordertraversal(root->right);
}

void postordertraversal(struct node *root)
{
    if(root==NULL) return;
    postordertraversal(root->left);
    postordertraversal(root->right);
    printf("%d->",root->data);
}


int main()
{
    struct node *root=create(1);

    insertleft(root,2);


    preordertraversal(root);
    printf("\n");
    postordertraversal(root);
    printf("\n");
    inordertraversal(root);

}