#include<stdio.h>
int main()
{
    char arr[]="mahadevmahadev";
    int size=0;
    int i=0;
    while(arr[i] != '\0'){
        size++;
        i++;
    }
    printf("%d\n",size);
    int j=0;
    int k=size-1;
    while(j<k){
        char temp=arr[j];
        arr[j]=arr[k];
        arr[k]=temp;
        j++;
        k--;
    }
    for(int i=0;i<size;i++){
        printf("%c",arr[i]);
    }
    puts(arr);
}