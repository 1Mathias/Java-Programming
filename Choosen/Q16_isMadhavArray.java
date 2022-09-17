package Choosen;

public class Q16_isMadhavArray {
    public static void main(String[] args) {
        System.out.println(isMadhav(new int[]{2,1,1}));
        System.out.println(isMadhav(new int[]{2,1,1,4,-2,0}));
    }

    static int isMadhav(int[] a) {
        int len = a.length;
        if (len < 3) return 0;

        int i, k, j, pos, sum = 0, init = a[0];

        for (i = 0; ; i++) {
            sum = i * (i + 1) / 2;
            if (sum == a.length) break;
            if (sum > a.length) return 0;
        }
        pos = i;

        for (i = 1, k = 1; i < pos; i++) {
            sum = 0;
            for (j = 0; j < i + 1; j++) {
                sum += a[k++];
            }
            if (sum != init) return 0;
        }
        return 1;
    }


    static int isMadArray(int[] a){
        int len=a.length;
        if(len<3) return 0;
        int i,k,j,pos,sum=0,init=a[0];

        for(i=0;;i++){

        }
    }
}
