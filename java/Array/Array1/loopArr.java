package Array1;
public class loopArr {
    public static void main(String[] args) {
        // int [] ages=new int[5];
        // ages[0]=11;
        // ages[4]=222;
        // for(int i=0;i<ages.length;i++){
        //     System.out.println(ages[i]);
        // }

        // int i=0;
        // while(i<ages.length){
        //     System.out.println(ages[i]);
        //     i++;
        // }

        int[][]age=new int [3][3];
        age[0][0]=11;
        age[0][1]=22;
        age[1][1]=44;
        for(int i=0;i<age.length;i++){
            for(int j=0;j<age[i].length;j++){

                System.out.println(age[i][j]);
            }
        }
    }
}
