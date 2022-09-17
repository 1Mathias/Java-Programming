package Choosen;

public class Q23_sumFactor {
    public static void main(String[] args){
        System.out.println(sumFactor(new int[]{9,-3,-3,-1,-1}));
    }
    static int sumFactor(int[] a){
        int sumFactor=0;
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        for(int j=0;j<a.length;j++){
            if(a[j]==sum){
               sumFactor++;
            }
        }
        return sumFactor;
    }
}
