#include<stdio.h>
int main()
{
    int l,b;
    scanf("%d %d",&l,&b);
    int area,perimeter;
    area=l*b;
    perimeter=2*(l+b);
    if(area>perimeter){
        printf("area is greater");
    }
    else{
        printf("perimter is greatere");
    }
}