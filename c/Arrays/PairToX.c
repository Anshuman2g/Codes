#include<stdio.h>
int main()
{
    int k=5;
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int cn=0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]+arr[j] == k)cn++;
        }
    }
    printf(" the no of pairs are that are equal is%d",cn);
}