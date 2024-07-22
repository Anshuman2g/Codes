#include<stdio.h>
#include <stdbool.h>
int main()
{
    int n;
    scanf("%d",&n);
    bool flag=true;
    for(int i=2;i<n;i++){
        if(n % 2 ==0){
            flag=false;
            printf("not a prime no ");
            break;
        }
    }
        if(flag == true){
            printf("it is a prime no");
        }
}