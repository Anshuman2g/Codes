#include<stdio.h>
#include<string.h>
   typedef struct person{     // we intialize here typedef
        char name[99];
        int age;
        int salary;
    } ram;   //here before ; we can put any name to change struct person to anything

int main()
{
    ram A;
    strcpy(A.name,"RAM");
    A.age=21;
    A.salary=1;

    ram B;
    strcpy(B.name,"MAHADEV");
    B.age=22;
    B.salary= 2;

    printf("%s\n",A.name);
    printf("%d",B.age);

}