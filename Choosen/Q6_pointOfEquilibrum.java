package Choosen;

public class Q6_pointOfEquilibrum {
    public static void main(String[] args){
        System.out.println(pointOfEquilibrum(new int[]{1,8,3,7,10,2}));
    }
    static int pointOfEquilibrum(int[] a){
        if(a.length<3){
            return -1;
        }
        int i=0;
        int j=a.length-1;
        int idx=1;
        int leftSum=a[i];
        int rightSum=a[j];
        for(int k=1;k<a.length-2;k++){
            if(leftSum<rightSum){
                i++;
                leftSum+=a[i];
                idx=i+1;
            }else{
                j--;
                rightSum+=a[j];
                idx=j-1;
            }
        }
        if(leftSum==rightSum)
            return idx;
        else
            return -1;

    }
}
