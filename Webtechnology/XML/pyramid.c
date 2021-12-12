#include<stdio.h>
int main()
{
    int i,j,k;
    int n;

    n=5;
    //5*2-1

    for(i=0;i<=n;i++)
    {
        for(j=i;j<=2*i-1;j++)
        {
            printf("*");
        }
        printf("\n");
    }


}