#include<stdio.h>
int main()
{
    int n;
    printf("enter the length");
    scanf("%d",&n);
    char arr[n];
    printf("enter the elements");
    for(int i=0;i<n;i++){
        scanf("%s",&arr[i]);
    }
     
     char ans[n];
     ans[0]=arr[0];
   int a=1;
   int idx=0;
   while(arr[idx] == arr[idx+1]){
    a++;
   }
   else{
    a=1;
   }
}