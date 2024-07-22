#include<stdio.h>
#include<string.h>
int main()
{
    typedef struct cricketer{
        char name[20];
        int age;
        int testmh;
        float avg;      //created a structure of cricket holding differnet data type
    }cricket;

    cricket arr[5];
    strcpy(arr[0].name,"Virat");
    arr[0].age=35;           //created 5 objects and storing them in array
    arr[0].testmh=893;
    arr[0].avg=99.9;

    strcpy(arr[1].name,"ABD");
    arr[1].age=39;
    arr[1].testmh=700;
    arr[1].avg=139.2;

    strcpy(arr[2].name,"Kapil");
    arr[2].age=60;
    arr[2].testmh=500;
    arr[2].avg=80.3;

    strcpy(arr[3].name,"Gayle");
    arr[3].age=43;
    arr[3].testmh=893;
    arr[3].avg=200.9;

    strcpy(arr[4].name,"Stark");
    arr[4].age=35;
    arr[4].testmh=893;
    arr[4].avg=153.9;

    for(int i=0;i<5;i++){
        printf("%s\n",arr[i].name);
        printf("%d\n",arr[i].age);
         printf("%d\n",arr[i].testmh);
          printf("%f\n",arr[i].avg);
    }
}