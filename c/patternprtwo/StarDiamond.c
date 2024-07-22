#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int sp =n/2;
    int str=1;
    int ml=n/2+1;
    for(int i=1;i<=n;i++){
     for(int f=1;f<=sp;f++){
        printf(" ");
     }
     for(int d=1;d<=str;d++){
        printf("*");
     }

        if(i<ml){
            sp--;
            str+=2;
        }
        else{
            sp++;
            str-=2;
        }
        printf("\n");
    }
}