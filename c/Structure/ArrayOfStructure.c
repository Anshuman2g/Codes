#include<stdio.h>
#include<string.h>
int main()
{
    typedef struct pokemon{
        char name[33];
        int power;
        char tier;
    } pok;

    pok arr[3];
    strcpy(arr[0].name,"ram");
    arr[0].power=15;
    arr[0].tier='A';

   strcpy(arr[1].name,"shiv");
    arr[1].power=99;
    arr[1].tier='B';

    strcpy(arr[2].name,"mahadev");
    arr[2].power=555;
    arr[2].tier='Z';

    for(int i=0;i<3;i++){
        printf("%s\n",arr[i].name);
         printf("%d\n",arr[i].power);
          printf("%c\n",arr[i].tier);
    }
}