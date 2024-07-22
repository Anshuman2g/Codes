#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<n;i++){
        printf("%d",arr[i]);
    }
    int s1=0;
    int s2=0;
    for(int i=0;i<n;i++){
        if(i%2 == 0){
        s1+=arr[i];
        }
        else {
            s2+=arr[i];
        }
    }
    int s3=s1-s2;
    printf("%d\n",s3);
}