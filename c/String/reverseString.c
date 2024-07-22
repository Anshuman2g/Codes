#include<stdio.h>
#include<string.h>
int main()
{
    char str[40];
    printf("enter the string");

    gets(str);
    
    int size=0;
    int i=0;
    while(str[i]!='\0'){
        size++;
        i++;
    }
    printf(" the size of given string is%d\n",size);
    // int size=strlen(str);
    // printf("%d\n",size);
    int m=0;
    int n=size-1;
    while(m<n){
        char temp=str[m];
        str[m]=str[n];
        str[n]=temp;
        m++;
        n--;
    }
    printf("string after reversing\n");
    puts(str);
}