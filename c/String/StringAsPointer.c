#include<stdio.h>
#include<string.h>
int main()
{
    char* str="RAM";
    str="MAHADEV"; //correct           
    printf("%s",str);
   
    str[0]='a';
    printf("%s",str);   /*this would result in error*/
 

    // char str[]="RAM";
    // str[0]='A';      // this is correct 
    // printf("%s",str);                        SIMPLE STRING CHANGING

    // str="MAHADEV";     // this is wrong 
    // printf("%s",str);

}
    // char str[]="mahadev ram";
    // char* ptr=str;
    // int i=0;
    // while(*ptr != '\0'){
    //     printf("%c",*ptr);
    //     ptr++;
    //     i++; 
    // }

//     char str[]="helloo";
//     int size=0;
//     int i=0;
//     while(str[i]!='\0'){
//         size++;
//         i++;
//     }
//     int m=0;
//     int n=size-1;
//     while(m<n){
//         char temp=str[m];
//         str[m]=str[n];
//         str[n]=temp;
//         m++;
//         n--;
//     }
//     puts(str);
//     printf("%s",str);
// }      

// //gets(str)
// //puts(str)      // three ways to take ip and op of a character array or a string
// // printf("%s",str);