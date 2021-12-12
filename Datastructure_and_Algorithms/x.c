
#include<stdio.h>
int main(​){
    int i;
    int num;

    printf("Enter the number of which u want to find the divisible of: ");
    scanf("%d",&num);

    printf("Number divisible by %d is:\n",num);
    for(i=0;i<=100;i++)
    {
        if(i%num==0)
        {
            printf("%d\n",i);
        }
    }
    return 0;
}