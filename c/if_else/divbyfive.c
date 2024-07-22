#include<stdio.h>
int main()
{
    int x;
    scanf("%d",&x);
    if( x % 5 == 0){
        printf("divisible");
    }
    else{
        printf("not divisible");
    }
}