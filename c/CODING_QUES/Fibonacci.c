#include<stdio.h>
#include<string.h>
int main()
{
 int k;
 scanf("%d",&k);

 int arr[k];
 arr[0]=0;
 arr[1]=1;
 for(int i=2;i<=k;i++){
    arr[i]=arr[i-1]+arr[i-2];
 }
 printf("%d",arr[k]);
}