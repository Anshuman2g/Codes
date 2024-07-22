#import<stdio.h>
int main(){
    float radius;
    printf("enter the radius\n");
    scanf("%f",&radius);    //using scanf then putting format specifier and variable name we take our input
    float pi =3.14;
    float area=pi*radius*radius;
    printf("the area of the circle is %f",area);
    return 0;
}