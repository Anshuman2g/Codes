#include<stdio.h>
#include<string.h>
#include<stdbool.h>
int main()
{
    int n;
    scanf("%d",&n);
    char arr[n];
    for(int i=0;i<n;i++){
    scanf("%s",&arr[i]);
    }
    int size=strlen(arr);
    printf("%d",size);
    int i=0;
    int j=size-1;
    bool flag=true;
    while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
        if (arr[i] != arr[j]) flag=false;
        break;
        i++;
        j--;
    }
    if(flag == false){
        printf("not palindrome");
    }
    else{
        printf("palindrome");
    }
}