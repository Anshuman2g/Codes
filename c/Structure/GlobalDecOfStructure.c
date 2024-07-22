#include<stdio.h>
#include<string.h>
typedef struct pokemon{
    int hp;
    int power;
}pokemon;
 void fun(pokemon p){
    printf("%d",p.hp);
 }
int main()
{
     pokemon ram;
     ram.hp=800;
     fun(ram);
}