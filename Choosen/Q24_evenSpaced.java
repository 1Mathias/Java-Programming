package Choosen;

public class Q24_evenSpaced {
    public static void main(String[] args){
        System.out.println(evenSpaced(new int[]{80,2,11,180}));
    }
    static int evenSpaced(int[] a){
        int isEvenSpaced=0;
        if(a.length<2)return 0;
        int maxValue=a[0];
        int minValue=a[0];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]>a[j]){
                    if(a[i]>maxValue)maxValue=a[i];
                }
                if(a[i]<a[j]){
                    if(a[i]<minValue)minValue=a[i];
                }
            }
        }
        if((maxValue-minValue)%2==0) isEvenSpaced=1;
        return isEvenSpaced;
    }
}
