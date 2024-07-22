public class uniqueElement {
    public static void main(String[] args) {
        int[] num={1,2,3,1,2,3,4};
         for(int i=0;i<num.length;i++){
            for(int j = i+1;j<num.length;j++){
                if(num[i] == num [j]){
                    num[i]=-1;
                    num[j]=-1;
                }
            }
         }

         int ans=-1;
         for(int i=0;i<num.length;i++){
            if(num[i] != -1)
            ans=num[i];
         }
         System.out.println(ans);
        
     
      
        
    }
}
