package Choosen;

public class Q7_nextPerfectSquare {
    public static void main(String[] args){
       int result=nextPerfectSquare(-5);
       System.out.println(result);
       result=nextPerfectSquare(0);
       System.out.println(result);
    }
    static int nextPerfectSquare(int number){
        int nextPerfectSquare=0;
        if(number>=0){
            double sqrt=Math.sqrt(number);
            int nextSquare=(int)sqrt+1;
            nextPerfectSquare=(int)Math.pow(nextSquare,2);

        }
        return  nextPerfectSquare;
    }
}
