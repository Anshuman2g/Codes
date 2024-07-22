#include<stdio.h>
#include<string.h>
int main()
{
   typedef struct pokemon{
        int age;
        int power;
        char name[34];
    } pok;
    
    pok a,b,c;
    strcpy(a.name,"Bulbasor");
    a.age=11;
    a.power=99;
    b=a;
    c=a;
    printf("%s",b.name);
    printf("#\n%d",c.age);
}