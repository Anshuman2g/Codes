#include<stdio.h>
int main()
{
    int n=2;
    int m=5;
    int pow=1;
    for(int i=1;i<=m;i++){
        pow=pow*n;
    }
    printf("%d",pow);
}