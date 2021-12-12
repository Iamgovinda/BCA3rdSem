#include<stdio.h>
#include<stdlib.h>
#define size 40

struct queue {
    int items[size];
    int front; 
    int rear;
};

struct queue* createqueue();
void enqueue(struct queue* q, int data);
int dequeue(struct queue* q);
void display(struct queue* q );
int isempty(struct queue* q);

struct node{

    
}