#include<stdio.h>
int main()
{
    char ch;
    scanf("%c",&ch);
    int n= ch-'A'+1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            printf("%c",(char)j+64);
        }
        printf("\n");
    }
}