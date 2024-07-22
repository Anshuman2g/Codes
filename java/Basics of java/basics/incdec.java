public class incdec{
    public static void main(String[] args){
        int x=5;
        System.out.println(x++);
        System.out.println(x);
        // yhn hamne phle x++ kiya post increment. mtlb x kn value abhi use hogi but store late hogi.
        // tn x kn value aayi 5
        // fir hmne sout krarya fir value jo hogi wo ayegi 6 kionki hmne kiya thaa post increment mtlb use abhi kiya value next wale mn store hogi.tn jaise first mn value 5 ayi tn agle mn ek add hoga tn 6 ayegi

        System.out.println(++x);
         System.out.println(x);
        //  tn yha hmne pre increment kiya hn. mtln value abhi add hogi ar abhi store hogi. tn value 6 ayegi.
        //  jb jm next sout krayege tn value same rhegi
        

        System.out.println(x--);
        System.out.println(x);
        // yhn ab post decrement hua. value abhi use hui store badd mn hui.phle 7 print krega fir 6.


        System.out.println(--x);
        System.out.println(x);
        // yhn pre decrement hua. value abhi use hui ar store bhi abhi

    }
}