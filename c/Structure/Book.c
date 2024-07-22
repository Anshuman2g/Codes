#include<stdio.h>
#include<string.h>
    struct book{
        char name[50];
        int price;
        int page;
    };
int main()
{
    struct book ra;
    strcpy(ra.name,"chanakya");
    ra.price=200;
    ra.page=50;
    printf("%s\n",ra.name);
    printf("%d\n",ra.price);
     printf("%d\n",ra.page);

     struct book mp;
     strcpy(mp.name,"ashoka");
     mp.price=100;
     mp.page=33;
     printf("%s\n",mp.name);
     printf("%d\n",mp.price);
     printf("%d\n",mp.page);

}