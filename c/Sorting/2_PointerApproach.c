#include<stdio.h>
int main()
{
    int arr[]={1,2,3,4,5};
    int k=7;
    int i=0;
    int j=4;
    while(i<j){
        if(arr[i]+arr[j]<k){
            i++;
        }
        else if(arr[i]+arr[j]>k){
            j--;
        }
        else if(arr[i]+arr[j] == k){
             printf("%d\n",arr[i]);
               printf("%d",arr[j]);
            break;
        }
    }
}