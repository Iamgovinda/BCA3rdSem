#include<stdio.h>
int sum(int *arr,int size);
int average(int *arr,int size);
int main()
{
    int array[20];

int size;
printf("Enter size of the array: ");
scanf("%d",&size);
    
for(int i=0;i<size;i++)
{
    printf("\nEnter number%d: ",i+1);
    scanf("%d",&array[i]);
}

printf("Sum=%d,Average=%d",sum(array,size),average(array,size));
    return 0;
}

int sum(int *arr,int size)
{
    int sum=0;
    for(int i=0;i<size;i++)
    {
            sum=sum+*(arr+i);
    }
    return sum;
}

int average(int *arr,int size)
{
    return sum(arr,size)/size;
}

