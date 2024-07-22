package Kunal.Basics;
class game{
    String name;
    int no;
    int rank;
    //  game(String na,int n,int rn){
    //     name=na;          // when we have different variable name
    //     no=n;            // no need of this keywords
    //     rank=rn;
    //  }
    //  game(String name,int no,int rank){
    //     this.name=name;           //same variable name
    //     this.no=no;               //this keyword needed here
    //     this.rank=rank;
    //  }
     game(String name,int no,int rank){
        name=name;           //when removing this keyword you are not assigning
        no=no;               // constructor parameter to instance varible     
        rank=rank;           
     }
}
public class thisKeyword {
    public static void main(String[] args) {
        game g1 = new game("ram",32,1);
        System.out.println(g1.name);
        System.out.println(g1.no);
        System.out.println(g1.rank);
    }
}
