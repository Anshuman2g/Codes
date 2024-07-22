package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try {
            // int c =a/b;
            // System.out.println(c);
            // divide(a,b);       //calling the function 
            throw new ArithmeticException("done manually"); // used to explicity throw an arithemeticException
        }catch (Exception e){
             System.out.println(e.getMessage());
        } finally{
            System.out.println("this would always run");
        }
        
    }

          static int divide(int a, int b) throws ArithmeticException{ // in throws if a condition occur then it might throw declaring
            if(b == 0){
                throw new ArithmeticException("do not divide by zero");
            }  
            return a/b;
          }
    }
