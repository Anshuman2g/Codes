#include<stdio.h>
int main()
{
//     int arr[5]={9,3,3,4,4};
//    for(int i=0;i<5;i++){
//     for(int j=i+1;j<5;j++){
//         if(arr[i] == arr[j]){
//             arr[i]=-1;
//             arr[j]=-1;
//         }
//     }
//    }
//    int ans=0;
//    for(int i=0;i<5;i++){
//     if(arr[i] != -1){
//         ans=arr[i];
//     }
//    }
//    printf("%d",ans);
  
   int arr[5]={9,3,3,4,4};
   int xor=0;
   for(int i=0;i<5;i++){
    xor=xor^arr[i];
   }
   printf("%d",xor);
}