#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    
    int clone[101]={0};

    for(int i=0;i<n;i++){
        if(arr[i]>=0 && arr[i]<=100){
        clone[arr[i]]++;
        }
    }
    int sum=0;
    for(int i=0;i<n;i++){
         if(clone[i] == 1){
            sum+=i;
         }
    }
    printf("%d",sum);
}