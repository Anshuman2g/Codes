public class tripletsum {
    public static void main(String[] args) {
        int [] num={1,2,4,7,8,3};
        int x=7;
        int count=0;
        for(int i=0;i<num.length;i++){
             for(int j=i+1;j<num.length;j++){
                for(int k=j+1;k<num.length;k++){
                    if(x == num[i]+num[j]+num[k]){
                        count++;
                    }
                }
             }
        }
        System.out.println(count);
    }
}
