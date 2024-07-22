#include<stdio.h>
int min(int a,int b){
    if (a<b) return a;
    else return b;
}
int hc(int a, int b){
    int hcf=0;
    for(int i=min(a,b);i>0;i--){
        if(a%i == 0 && b%i ==0){
            hcf=i;
            break;
        }
    }
    return hcf;
}
int main()
{
    int a=30;
    int b=60;
  int hcf=  hc(a,b);
    printf("%d %d %d",a,b,hcf);
}