package Questions;

public class isSquare {
    public static void main(String[] args){
        int result=isSquare(4);
        System.out.println(result);
        result=isSquare(25);
        System.out.println(result);
        result=isSquare(-4);
        System.out.println(result);
        result=isSquare(8);
        System.out.println(result);
        result=isSquare(0);
        System.out.println(result);
    }
    static int _isSquare(int n){
        int isSquare =0;
        if(n>=0){
         double sqrt=Math.sqrt(n);
         int baseNumber=(int)sqrt;
         if(sqrt-baseNumber==0){
             isSquare=1;
         }else{
             isSquare=0;
         }
        }
        return isSquare;
    }
    static int isSquare(int n){
        int isSquare=0;
        for(int i=0;i<=n;i++){
            if(i*i==n){
                isSquare=1;
                break;
            }
        }
        return isSquare;
    }
}
