#include<stdio.h>
#include<string.h>
int main()
{
    struct pok{
        int speed;                //we created a class or structure it to store or 
        int attack;                      //hold different data type value 
        char type[100];
    }; 

    struct pok pika;
    pika.speed=50;                        //here giving value to each attribute or some of attribute value
    pika.attack=22;
    strcpy(pika.type,"electric");
    printf("%s\n",pika.type);               //op
 
    struct pok charizard;
    charizard.speed=100;                      //another object created 
    charizard.attack=100;
    // charizard.type="fire";
    // printf("%s",charizard.type);
}