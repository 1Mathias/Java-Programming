public class recursionfunctions {
    public static void main(String[] args) {
        int result;
        result = sum(3);
        System.out.println(result);

        int sumendresult=sum(5,10);
        System.out.println(sumendresult);


    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
    public static int sum(int start,int end){
        if(end>start){
            return end+sum(start,end-1);
        }else{
            return end;
        }
    }
}
