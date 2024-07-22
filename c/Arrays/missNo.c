#include<stdio.h>
int main()
{
    int arr [5]={0,1,2,3,5};
    int sum=0;
    for(int i=0;i<5;i++){
        sum+=arr[i];
    }
    int sum2=0;
    for(int i=0;i<=5;i++){
       sum2+=i;
    }
    printf("%d",sum2-sum);
}