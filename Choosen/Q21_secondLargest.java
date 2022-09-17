package Choosen;

public class Q21_secondLargest {
    public static void main(String[] args){
        System.out.println(secondLargest(new int[]{3,4,5,1}));
    }
    static int secondLargest(int[] a){
        int max1=0;
        int max2=0;

        for(int i=0;i<a.length;i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            }else if(a[i]!=max1&&a[i]>max2){
                max2=a[i];
            }
        }
        return max2;
    }
}
