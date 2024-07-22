#include<stdio.h>
int main()
{
    // for(int i=0;i<=100;i+=2){
    //     printf("%d\n",i);
    // }    

    //table of 9
    int n;
    scanf("%d",&n);
    for(int i=n;i<=n*10;i+=n){
        printf("%d \n",i);
    }
}