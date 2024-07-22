#include<stdio.h>
#include<string.h>
int main(){
char arr[100]="Ram Got 100 Marks in Hindi";
int size=strlen(arr);
int vo=0;
int co=0;
int di=0;
int sp=0;
for(int i=0;i<size;i++){
  if(arr[i] =='a' || arr[i]=='e'  || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'){
    vo++;
  }
  else if((arr[i]>='a' && arr[i]<='z') || (arr[i]>='A' && arr[i]<='Z')){
    co++;
  }
  else if(arr[i]>='0' && arr[i]<='9'){
    di++;
  }
  else{
    sp++;
  }
}
printf("%d %d %d %d",vo,co,di,sp);
}