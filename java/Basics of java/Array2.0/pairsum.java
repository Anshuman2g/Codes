public class pairsum{
 public static void main(String[] args) {
    int [] num ={4,6,3,5,8,2};
    int x=10;
    int count=0;
    for(int i=0;i<num.length;i++){    //{4,7,5,3,} yh 1st element present ho rha hn ie =4
        for(int j=i+1;j<num.length;j++) {     //yhn 2nd element present ho rha hn ie =7
         if(x == num[i]+num[j]){
            count ++;
         }
        }  
    }
    System.out.println(count);
    
  
    
 }
}