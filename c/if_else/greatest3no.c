#include<stdio.h>
int main()
{
    int a,b,c;
    scanf("%d %d %d",&a,&b,&c);
    // if(a > b && a>c){
    //     printf("a is greater %d",a);
    // }
    // else if(b> a && b>c){
    //     printf("b is greater %d",b);
    // }
    //   if(c > a && c>b){
    //     printf("c is greater %d",c);
    // }

    if(a>b){
        if(a>c){
            printf("a is the greatest %d",a);
        }
        else{                                       //see if a is greater than b and then a is not greatet then c 
            printf("c is th greatest %d",c);        // meaning c is greater than a and a was greater then b
                                                // technically c is greater than b also as it is greater than a
        }
    }
    else{
        if(b>c){
            printf("b is greatest %d",b);
        }
        else{
            printf("c is the greatest %d",c);
        }
    }
}