#include<stdio.h>
void swap(int arr[],int a,int b){
    while(a<b){
        int temp=arr[a];
       arr[a]=arr[b];
        arr[b]=temp;
        a++;
        b--;
    }
    return;
 }
int main(){
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n ;i++){
        scanf("%d",&arr[i]);
    }
    int k=7;
    int x=0;
    k=k%n;
   swap(arr,x,n-1);
   swap(arr,x,k-1);
   swap(arr,k,n-1);
   for(int i=0;i<n;i++){
    printf(" Array after rotating k steps %d \n",arr[i]);
   }
}