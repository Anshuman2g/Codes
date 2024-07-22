#include<stdio.h>
#include<string.h>
#include<stdbool.h>
int main()
{
    typedef struct days{
        int day;
        int month; 
        int year;
    }com;
      
      com a,b;
      a.day=4;
      a.month=5;
      a.year=2000;

      
      b.day=4;
      b.month=5;
      b.year=2000;


      bool flag=true;
      if(a.day != b.day) flag=false;
       if(a.month != b.month) flag=false;
        if(a.year != b.year) flag=false;
       
       if(flag == true) printf("both are equal");
       else printf("not equal");
} 