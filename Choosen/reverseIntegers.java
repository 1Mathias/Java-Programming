package Choosen;

public class reverseIntegers {
    public static void main(String[] args){
        System.out.println(reverseIntegers(1234));
        System.out.println(reverseIntegers(-12005));

    }
    static int reverseIntegers(int  number){
        int sign=1;
        if(number==0) return 0;
        if(number<0){
            sign=-1;
            number=-number;
        }
        int reverse =0;
        while(number!=0){
            int remainder=number%10;
            reverse=(reverse*10)+remainder;
            number/=10;
        }
        return sign*reverse;
    }
}
