package Questions;

public class sumFactor {
    public static void main(String[] args){
        int result = _sumFactor(new int[]{3,0,2,-5,0});
        System.out.println(result);
    }
    static int sumFactor(int[] a){
        int sumFactor=0;
        int occuranceOfOne=0;
        if(a.length==0 ||a==null){
            return 0;
        }
        for(int index=0;index<a.length;index++){
            if(a[index]==1){
                occuranceOfOne++;
            }
        }
        for(int index=0;index<a.length;index++){
            sumFactor+=a[index];

        }
        for(int index=0;index<a.length;index++){
            if(a[index]==sumFactor){
                return sumFactor;
            }
        }
        return 0;
    }
    static int _sumFactor(int[] a){
        int sum=0;
        int sumFactor=0;
        for(int index=0;index<a.length;index++){
            sum+=a[index];
        }
        for(int index=0;index<a.length;index++){
            if(a[index]==sum){
                sumFactor++;
            }
        }
        return  sumFactor;
    }
}
