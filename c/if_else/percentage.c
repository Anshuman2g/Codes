#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    if(n>=91 && n<=100){
        printf("excellent");
    }
   else if(n>=81 && n<=90){
        printf("very good");
    }
   else if(n>=71 && n<=80){
        printf("good");
    }
   else if(n>=61 && n<=70){
        printf("ok");
    }
    else if(n<=45){
        printf("fail");
    }
}