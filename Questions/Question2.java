package Questions;

public class Question2 {
    public static void main(String[] args) {
        int[] a={20,3,7,9,11,4,6};
        System.out.println(isMagicArray(a));
    }

    static int isMagicArray(int[] a){
        int sum=0;
        if(a[0]==0)
            return 1;
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=2;j<a[i];j++){
                count++;
            }
            if(count==0&&a[i]>0)
                sum+=a[i];
        }
        if(sum==a[0])
            return 1;
        return  0;
    }
}

