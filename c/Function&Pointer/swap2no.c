#include<stdio.h>
void swap(int* a , int* b){

    int temp=*a;
    *a=*b;
    *b=temp;
}
int main()
{
    int n,m;
    printf("enter the value of n and then m");
    scanf("%d %d",&n,&m);
     swap(&n,&m);
    printf("the value of n is %d \n",n);
     printf("the value of m is %d",m);
}