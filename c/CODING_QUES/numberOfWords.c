#include<stdio.h>
#include<string.h>
int main()
{
    int cn=1;
    char arr [100]="All the best mahadev mahadev";
    int size=strlen(arr);
    for(int i=0;i<100;i++){
        if(arr[i] == ' '){
            cn++;
        }
    }
    // int i=0;
    // while(arr[i] != '\0'){
    //     if(arr[i] == ' '){
    //         cn++;
    //     }
    //     i++;
    // }
    printf("%d",cn);
}