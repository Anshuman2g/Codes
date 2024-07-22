#include<stdio.h>
#include<limits.h>
int main()
{
    int n;
    printf("enter the length of array");
    scanf("%d",&n);
    int arr[n];
    printf("enter the elements of array");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<n-1;i++){
        int min=INT_MAX;
        int minidx=-1;
        for(int j=i;j<n;j++){
           if(arr[j]<min){
            min=arr[j];
            minidx=j;
           }
        }
        int temp=arr[i];
        arr[i]=arr[minidx];
       arr[minidx]=temp;
    }
    for(int i=0;i<n;i++){
        printf("%d\n",arr[i]);
    }
}