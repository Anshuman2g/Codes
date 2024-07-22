#include<stdio.h>
void swap(int x[]){
    int temp=x[0];
    x[0]=x[1];
    x[1]=temp;
    return;
}

int main()
{
    int n;
   scanf("%d",&n);
   int arr[n];
   for(int i=0;i<n;i++){
    scanf("%d",&arr[i]);
   }
    swap(arr);
   for(int i=0;i<n;i++){
    printf("%d\n",arr[i]);
   }
}