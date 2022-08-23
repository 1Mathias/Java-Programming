package Questions;

public class nextPerfectSquare {
    public static void main(String[] args){
        int result=nextPerfectSquare(6);
        System.out.println(result);
        int result1=nextPerfectSquare(-5);
        System.out.println(result1);
    }
    static int nextPerfectSquare(int n){
        int nextPerfectSquare=0;
        if(n>=0){
            double sqrtofnum=Math.sqrt(n);
            int baseNumber=(int)sqrtofnum+1;
            nextPerfectSquare=(int)Math.pow(baseNumber,2);
        }
        return nextPerfectSquare;

    }
}
