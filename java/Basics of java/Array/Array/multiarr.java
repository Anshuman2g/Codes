package Array;

//  public class multiarr {
//     public static void main(String[] args) {
//         int [] [] ages = new int [4] [3] ;

//         ages [0] [0] =20;
//         ages [1] [0]=90;

//         System.out.println(ages [0] [0] );
//          System.out.println(ages [1] [0] );
//          System.out.println(ages.length);

        
//     }
    
// }


// For loop

 public class multiarr {
    public static void main(String[] args) {
    int [] age= new int[4];
    age[3]=89999;
    age[2]=799999;
    age[1]=688999;


    // for(int i=0; i<4; i++){
    //     System.out.println(age[i]);
    // }



    // for each loop
    // for(int a : age){
    //     System.out.println(a);
    // }


    int i=0;
    while(i<4){
        System.out.println(age[i]);
        i++;
    }
}
 }
