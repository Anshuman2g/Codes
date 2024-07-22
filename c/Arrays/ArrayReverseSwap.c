#include<stdio.h>
int main()
{
    int n;
    printf("enter the length of array");
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
     int i=0;
     int j=n-1;
     while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
     } 
    //  OR
    // for(int i=n-1;i>=0;i--){
    //     scanf("%d",&arr[i]);
    // }
     for(int i=0;i<n;i++){
        printf(" array after reversing is :%d\n",arr[i]);
    }
}