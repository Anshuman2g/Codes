#include<stdio.h>
int main()
{
    // vol=4/3 pi * r r r 
    float pi=3.14;
    int r;
    float vol=0;
    printf("enter the radius");
    scanf("%d",&r);
     vol=(4*pi*r*r*r)/3;
    printf("the vol is %f",vol);
    
}