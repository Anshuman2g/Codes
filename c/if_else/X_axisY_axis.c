#include<stdio.h>
int main(){
    int x,y;
    scanf("%d %d",&x,&y);
    if(x == 0 && y==0){
        printf("lies on orign");
    }
    else if(x == 0){
        printf("lies on y axis");
    }
    else{
        printf("lies on x axis");
    }
}