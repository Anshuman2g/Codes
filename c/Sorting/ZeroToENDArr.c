// #include<stdio.h>
// int main()
// {
//     int arr[]={0,1,2,3,0};
//     int n=5;
//     int ans[n];
//     int idx=0;
//      for(int i=0;i<n;i++){
//         if(arr[i]>0){
//             ans[idx++]=arr[i];
//         }
//      }
//     while(idx < n){
//         ans[idx]=0;
//         idx++;
//     }
   
//     for(int i=0;i<n;i++){
//         printf("%d",ans[i]);
//     }

// }
#include<stdio.h>
#include<stdbool.h>
int main()
{
    int n;
    printf("enter the length of array");
    scanf("%d",&n);
    int arr[n];
    printf("enter the elements of the array");
    for(int i=0;i<n;i++){
    scanf("%d",&arr[i]);
    }

    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-1;j++){
            if(arr[j]== 0){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    for(int i=0;i<n;i++){
        printf("%d\n",arr[i]);
    }

}