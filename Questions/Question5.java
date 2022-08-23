package Questions;

public class Question5 {
    public static void main(String[] args){
        int[] a={4,5,5,7};
//        int[]  a={4,5,7,9};
        System.out.println(isBalanced(a));
        System.out.println(_isBalanced(a));
    }
    static int isBalanced(int[] a) {
        Boolean isEven = true;
        for (int i = 0; i < a.length; i++) {
            if (isEven == (a[i] % 2 == 0)) {
                isEven = !isEven;
                continue;
            } else {
                return 0;
            }
        }

        return 1;
    }
    static int _isBalanced(int[] a){
        for(int i=0;i<a.length;i++){
            if(i%2==0&&a[i]!=0)
                return 0;
            if(i%!=0&&a[i]%2==0)
                return 0;
        }
    }
}
