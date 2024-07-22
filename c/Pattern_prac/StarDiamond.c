#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int space=n/2;
    int star=1;
    int ml=(n/2)+1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=space;j++){
        printf(" ");
      }
      for(int k=1;k<=star;k++){
        printf("*");
      }
      if(i<ml){
        space--;
        star+=2;
      }
      else{
        space++;
        star-=2;
      }
      printf("\n");
    }

}