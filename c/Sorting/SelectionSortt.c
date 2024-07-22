#include<stdio.h>
#include<limits.h>
int main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<n-1;i++){
        int minval=INT_MAX;
        int idx=-1;
        for(int j=i;j<n;j++){
            if(arr[j]<minval){
                minval=arr[j];
                idx=j;
            }
        }
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }
    for(int i=0;i<n;i++){
        printf("%d",arr[i]); 
    }
}