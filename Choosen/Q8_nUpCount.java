package Choosen;

public class Q8_nUpCount {
    public static void main(String[] args) {
        int result = nUpCount(new int[]{2, 3, 1, -6, 8, -3, -1, 2}, 5);
        System.out.println(result);
        result = nUpCount(new int[]{6, 3, 1}, 6);
        System.out.println(result);
        result = nUpCount(new int[]{1, 2, -1, 5, 3, 2}, 2);
        System.out.println(result);
    }
    static int nUpCount(int[] a, int n) {
       int partialSum=0;
       int previousPartialSum=0;
       int nUpCount=0;

       for(int i=0;i<a.length;i++){
           previousPartialSum=partialSum;
           partialSum+=a[i];
           if(previousPartialSum<=n && partialSum>n){
               nUpCount++;
           }
       }
       return nUpCount;
    }
    static int _nUpCount(int[] a, int n) {
        int partialSum = 0;
        int previousPartialSum = 0;
        int upcount = 0;
        for (int i = 0; i < a.length; i++) {
            previousPartialSum = partialSum;
            partialSum += a[i];
            if (previousPartialSum <= n && partialSum > n) {
                upcount++;
            }
        }
        return upcount;
    }
}
