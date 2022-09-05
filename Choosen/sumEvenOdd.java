package Choosen;

public class sumEvenOdd {
    public static void main(String[] args){
        System.out.println(sumEvenOdd(new int[] {1}));
        System.out.println(sumEvenOdd(new int[] {1,2}));
        System.out.println(sumEvenOdd(new int[] {1,2,3}));
        System.out.println(sumEvenOdd(new int[] {1,2,3,4}));
        System.out.println(sumEvenOdd(new int[] {3,3,4,4}));
        System.out.println(sumEvenOdd(new int[] {}));
    }
    static int sumEvenOdd(int[] a){
        int evensum=0;
        int oddsum=0;
        int sum=0;

        for(int i=0;i<a.length;i++){
            if(a[i]%2==0) {
                evensum += a[i];
            }else{
                oddsum+=a[i];
            }
            sum=oddsum-evensum;
        }
        return sum;
    }
}
