package format;
public class squareRootX {
          static int square(int x){
            int st=0;
            int end=x;
            while(st<=end){
                int med= st+ (end-st)/2;
                int value=med*med;
                if(value == x){
                    return med;
                }
                else if(value>x){
                    end=med-1;
                }
                else{
                    st=med+1;
                }
            }
            return end;
          }
    
    public static void main(String[] args) {
       
        int x=11;
        System.out.println(square(x));
        
    }
}

