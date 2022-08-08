package Questions;

public class Question3 {
    public static void main(String[] args){
        int[] b={2,3,4,5,6};
        System.out.println(isComplete(b));
    }
    static int isComplete(int[] a){

        int min=0,max=0,counteven=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                min=a[i];
                max=a[i];
                break;
            }

        }
        for(int j=0;j<a.length;j++){
            if(a[j]%2==0){
                counteven++;
                if(max<a[j])
                    max=a[j];
                if(min>a[j])
                    min=a[j];
            }
        }
        int x=(max-min)-1;
        int count=0;
        int y=min+1;
        for(int m=0;m<a.length;m++){
            if(y==a[m]&&y<max){
                count++;
                y++;
                m=-1;
            }
        }
        if(count==x)
            return 1;
        return 0;
    }

}
