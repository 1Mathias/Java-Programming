package Choosen;

public class Q22_statonMeasure {
    public static void main(String[] args){
        System.out.println(statonMeasure(new int[]{1,1,2,2,3}));
    }
    static int statonMeasure(int[] a){
        int occureanceofOne=0;
        int statonMeasure=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                occureanceofOne++;
            }

        }
        for(int j=0;j<a.length;j++){
            if(a[j]==occureanceofOne){
                statonMeasure++;
            }
        }

        return statonMeasure;
    }
}
