#include<stdio.h>
#include<string.h>
int main()
{
    // char str[]="MAHADEV";
    // int x=strlen(str);        //strelen -- length of the string
    // printf("%d",x);

    // char st[4]="RAM";
    // char st2[4];
    //  strcpy(st2,st);         //strcpy -- to copy one string into another
    //  printf("%s",st2);
    //  return 0;

    char str[20]="mahadev";
    char str2[]="krishna";          //strcat to concatinate two string means to add 1 string to another
    strcat(str,str2);
    printf("%s",str);
}