#include<stdio.h>
#include<string.h>
int main()
{
    char arr[]="mahadev";
    int size=0;
    int i=0;
    while(arr[i]!= '\0'){
        size++;
        i++;
    }
    char cop[size];
    for(int i=0;i<=size;i++){
        cop[i]=arr[i];
    }
    printf("%s\n",cop);
    puts(cop);
}