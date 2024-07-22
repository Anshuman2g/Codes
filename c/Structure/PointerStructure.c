#include<stdio.h> 
typedef struct pokemon{
    int age;
    int power;
}pok;

int main(){
//    pok p;
//    p.age=88;
//    p.power=99;
//    pok* k=&p;
//    printf("%p",k);
//    printf("%p",&p.age);        //printing the addresses 
//    printf("%p",&p.power);

 pok pika;
 pika.age=99;
 printf("%d\n",pika.age);
pok* x=&pika;
(*x).age=70;
x->age=1110;
 printf("%d",pika.age);
}