#include<stdio.h>
int main()
{
    int arr [4]={111,222,333,444};
    for(int i=0;i<4;i++){
        printf("%p\n",&arr[i]);
    }
}