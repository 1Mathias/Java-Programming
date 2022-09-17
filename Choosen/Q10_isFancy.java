package Choosen;

public class Q10_isFancy {
    public static void main(String[] args){
        System.out.println(isFancy(1));
        System.out.println(isFancy(5));
        System.out.println(isFancy(17));
        System.out.println(isFancy(68));
    }
    static int isFancy(int number){
        int isFancyNumber=0;
        int previous=1;
        int pPrevious=1;
        int currentNumber=0;
        if(number ==1) return 1;
        if(number<=0) return 0;

        for(int i=0;i<number/2;i++){
            currentNumber=3*previous+2*pPrevious;
            if(currentNumber==number){
                isFancyNumber=1;
                break;
            }else{
                isFancyNumber=0;
                pPrevious=previous;
                previous=currentNumber;
            }
        }
        return isFancyNumber;
    }
    static int _isFancy(int n){
        int isFancyNumber=0;
        int pPrevious=1;
        int previous=1;
        int currentNumber=0;
        if(n==1) return 1;
        if(n<=0) return 0;

        for(int i=0;i<n/2;i++){
            currentNumber=3*previous+2*pPrevious;

        }
        return isFancyNumber;
    }
}
