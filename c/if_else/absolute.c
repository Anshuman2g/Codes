#include<stdio.h>
int main()
{
    int x;
    scanf("%d",&x);
    // if(x>0){
    //     printf("%d",x);
    // }
    // else{
    //     printf("%d",-x);
    // }
    if(x<0){
        x=x*-1;
    }
    printf("%d",x);
}