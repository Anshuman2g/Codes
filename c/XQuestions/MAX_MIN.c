#include<stdio.h>
#include<limits.h>
int main()
{
    int arr[]={1,5,3,4,2};
    int k=2;
    int ans=INT_MIN;
    int a1=0;
    for(int i=0;i<5;i++){
        if(arr[i]>ans){
            ans=arr[i];
        }
    }

    int ans2=INT_MAX;
    int a2=0;;
    for(int i=0;i<5;i++){
        if(arr[i]<ans2){
            ans2=arr[i];
        }
    }
    if( k == 1){
        printf("%d",ans2);
    }
    else{
        printf("%d",ans);
    }
}