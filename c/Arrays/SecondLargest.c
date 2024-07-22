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

    int max=INT_MIN;
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    printf(" the maximum element is :%d\n",max);

    int smax=INT_MIN;
    for(int i=0;i<n;i++){
        if(arr[i]>smax && arr[i]!= max){
            smax=arr[i];
        }
    }
    printf(" the second maximum element is :%d",smax);
}
