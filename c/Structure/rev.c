#include<stdio.h>
#include<string.h>
typedef struct pokem{
    int speed;
    char tier;
    char name[50];
}pok;

int main()
{
    // pok chari;
    // chari.speed=50;
    // chari.tier='A';
    // strcpy(chari.name,"charifire");
    // printf("%d\n",chari.speed);
    //   printf("%s",chari.name);

    pok arr[3];
    arr[0].speed=11;
    arr[0].tier='a';
    strcpy(arr[0].name,"fire");

    arr[1].speed=1111;
    arr[1].tier='b';
    strcpy(arr[1].name,"water");

    arr[2].speed=2222;
    arr[2].tier='c';
    strcpy(arr[2].name,"earth");

    for(int i=0;i<3;i++){
        printf("%d\n",arr[i].speed);
        printf("%c\n",arr[i].tier);
        printf("%s\n",arr[i].name);
    }
}