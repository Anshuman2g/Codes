#include<stdio.h>

// void swap( int*a,int*b){
//     int temp=*a;
//     *a=*b;
//     *b=temp;
// }
//     int main()
//     {
//       int a,b;
//       a=5;
//       b=10;
//       swap(&a,&b);
//       printf(" the value of a is :%d\n",a);
//       printf(" the value of b is :%d",b);
//     }
           int main(){
        int a=5;
        int* x =&a;
        int** y=&x;
        printf("%p\n",&x);
        printf("%p",y);        //these two things are printing address of x
           }