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
    
   for(int i=0;i<n;i++){
    if(i%2 != 0){
      arr[i]=arr[i]*2;
    }
    else{
        arr[i]+=10;
    }
   }
    for(int i=0;i<n;i++){
        printf(" the value of array after changing are %d\n",arr[i]);
    }
}