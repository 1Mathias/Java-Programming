package Choosen;

public class Q11_isMera {
    public static void main(String[] args){
        System.out.println(isMeraArray(new int[]{9,10,1}));
        System.out.println(isMeraArray(new int[]{10}));
    }
    static int isMeraArray(int[] a){
        int isMeraArray=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1 || a[i]==9){
                if(a[i]==1){
                    for(int j=i;j<a.length;j++){
                        if(a[j]==9){
                            isMeraArray=1;
                            return isMeraArray;
                        }
                    }
                    isMeraArray=0;
                    return isMeraArray;
                }
                if(a[i]==9){
                    for(int j=i;j<a.length;j++){
                        if(a[j]==1){
                            isMeraArray=1;
                            return isMeraArray;
                        }
                    }
                    isMeraArray=0;
                    return isMeraArray;
                }
            }
            else {
                isMeraArray = 1;
                return isMeraArray;
            }

        }

        return isMeraArray;
    }

}
