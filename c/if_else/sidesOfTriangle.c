#include<stdio.h>
int main()
{
    int a,b,c;
    scanf("%d %d %d",&a,&b,&c);
    if(a+b>c && b+c>a && c+a>b){
        printf("it can form sides of the triangle");
    }
    else{
        printf("it cant");
    }
}