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

    bool flag=true;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=false; 
            }
        }
            if(flag == true) break;
    }
    for(int i=0;i<n;i++){
        printf("%d\n",arr[i]);
    }

}