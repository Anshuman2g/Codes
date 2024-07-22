#include<stdio.h>
void us(){
   printf("i am an american\n");
    return;
}
void australia(){
   printf("i am an austri\n");
   us();
    return;             //isme us fuction tha, 
                          // so in end jb main mh india call hoga toh 
}                       // sb funtion call hoge kioki ek function ke andr dusra
void india(){
   printf("i am an indian\n");
   australia();
    return;             //esme australia function tha
}
int main()
{
      india();       //yha hmne india function ko call kraya
      return 0;
}