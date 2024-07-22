#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int min=1;
    for(int i=1;i<=n;i++){
        for(int k=1;k<=n-i;k++){
            printf(" ");
        }
        for(int j=1;j<=min;j++){
            printf("%c",(char)j+64);
        }
        printf("\n");
        min+=2;
    }
}