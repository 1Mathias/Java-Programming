public class multidimensionalarray {
    public static void main(String[] args){
        int[][] mynumbers={{1,2,3,4},{5,6,7}};
        int x=mynumbers[0][2];
        System.out.println(x);
        System.out.println(mynumbers.length);
        for(int i=0;i<mynumbers.length;i++){
            for(int j=0;j<mynumbers[i].length;j++){
                if(i==0){
                    System.out.println("First Array "+mynumbers[i][j]);
                }
                else{
                    System.out.println("Second Array "+mynumbers[i][j]);
                }
                System.out.println(mynumbers[i][j]);

            }
        }
    }
}
