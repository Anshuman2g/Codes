#include<stdio.h>
int main()
{
   int n;
   scanf("%d",&n);
   char arr[n];
   for(int i=0;i<n;i++){
      scanf("%s",&arr[i]);
   }
   for(int i=0;i<n;i++){
      if(i % 2 == 0){
         arr[i]++;
      }
      else{
         arr[i]--;
      }
   }
   // for(int i=0;i<size;i++){
   //    printf("%c",arr[i]);
   // }
   printf("%s",arr);
}