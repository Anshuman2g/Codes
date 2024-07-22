#include<stdio.h>
int main()
{
    int cp;
    int sp;
    int profit=0;
    int loss=0;
    scanf("%d %d",&cp,&sp);
    if(cp>sp){
        loss=cp-sp;
      printf("loss is made %d",loss);
    }                                   ///three given no can be sides of the triangle
    else if(sp>cp){
        profit=sp-cp;
        printf("profit is made %d",profit);
    }
    else{
        printf("no loss no profit");

    }
}