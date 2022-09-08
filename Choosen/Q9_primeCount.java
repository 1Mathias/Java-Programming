package Choosen;

public class Q9_primeCount {
    public static void main(String[] args) {
        int result = primeCount(10, 30);
        System.out.println(result);
        result = primeCount(11, 29);
        System.out.println(result);
        result = primeCount(20, 22);
        System.out.println(result);

    }

    static int primeCount(int start, int end) {
        int primeCount=0;
        for(int number=start;number<=end;number++){
            if(number>1){
                boolean isprime=true;
                for(int divider=2;divider*2<=number;divider++){
                    if(number%divider==0){
                        isprime=false;
                        break;
                    }
                }
                if(isprime){
                    primeCount++;
                }
            }
        }
        return primeCount;
    }


}
