package Choosen;

public class Q17_inertial {
    public static void main(String[] args){
        System.out.println(isInertail(new int[]{2, 4, 6, 9, 10}));
    }
    static int isInertail(int[] a) {
        if(a.length<2) return 0;
        int i,j,max=a[0],odd=0;
        int[] oddArray=new int[a.length];

        for(i=0,j=0;i<a.length;i++){
            if((a[i]%2)!=0) oddArray[odd++]=a[i];
            if(a[i]>max) max=a[i];
        }
        if(max%2!=0||odd<1) return 0;

        for(i=0;i<odd;i++){
            for(j=0;j<a.length;j++){
                if(a[j]%2==0&&a[j]!=max&&a[j]>oddArray[i]) return  0;
            }
        }
        return 1;
    }
    static int myArray(int[] a){
        if(a.length<2) return 0;
        int i,j,max=a[0],odd=0;
        int[] oddArray=new int[a.length];

        for(i=0;i<a.length;i++){
            if(a[i]%2!=0) oddArray[odd++]=a[i];
            if(a[i]>max) max=a[i];
        }
        if(max%2!=0||odd<1) return 0;
        for(i=0;i<odd;i++){
            for(j=0;j<a.length;j++){
                if(a[j]==0&&a[j]!=max&&a[j]>oddArray[i]) return 0;
            }
        }
        return 1;
    }
}
