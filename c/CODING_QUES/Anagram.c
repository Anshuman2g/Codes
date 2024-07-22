#include<stdio.h>
#include<string.h>
#include<stdbool.h>
int main()
{     

    int n; 
    scanf("%d",&n);
    char arr[n];
    for(int i=0;i<n;i++){
        scanf("%s",&arr[i]);
    }
    int m; 
    scanf("%d",&m);
    char arr2[m];
    for(int i=0;i<m;i++){
        scanf("%s",&arr2[i]);
    }

    int freq[26]={0};
    for(int i=0;i<n;i++){
        freq[arr[i] -'a']++;
    }
    for(int i=0;i<m;i++){
        freq[arr2[i]-'a']--;
    }
    bool flag=true;
    for(int i=0;i<26;i++){
        if(freq[i] != 0){
            flag=false;
            break;
        }
    }
    printf("%d",flag);
}