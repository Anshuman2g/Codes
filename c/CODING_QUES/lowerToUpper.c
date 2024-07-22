#include<stdio.h>
#include<string.h>
int main()
{
    char arr[100];
    scanf("%s",arr);
       int size=strlen(arr);
    for(int i=0;i<size;i++){
        if(arr[i]>='a' && arr[i]<='z'){
          arr[i]=(char) arr[i] -32;
        }
    }
    printf("%s",arr);
}