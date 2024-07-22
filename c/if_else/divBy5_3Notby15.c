#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    // if(n % 3 == 0 || n% 5 == 0){
    //     if(n % 15 !=0){
    //         printf("the no is div by 3 or 5 but not by 15");
    //     }
    //     else{
    //         printf("div by 15");
    //     }
    // }
    if( (n% 3==0 || n% 5 ==0) && n%15 !=0){
          printf("the no is div by 3 or 5 but not by 15");
    }
    else{
        printf("div by 15");
    }
}