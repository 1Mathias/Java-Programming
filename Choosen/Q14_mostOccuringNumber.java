package Choosen;

public class Q14_mostOccuringNumber {
    public static void main(String[] args) {
        System.out.println(
                mostOccuringNumber(new int[]{6, 8, 1, 8, 2}));
        System.out.println(
                mostOccuringNumber(new int[]{6, 8, 1, 8, 2,6}));
        System.out.println(
                repme(new int[]{6, 8, 1, 8, 2,6}));
    }

    static int mostOccuringNumber(int[] a) {
        int counter = 0;
        int temp = 0;
        int mostOccurredNumber = a[0];
        int newLength = a.length;


        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    newLength--;
                    break;
                }
            }
        }

        int[] newArray = new int[newLength];
        newArray[0] = a[0];
        boolean isDuplicate;
        int idx = 1;
        for (int i = 1; i < a.length; i++) {
            isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                newArray[idx] = a[i];
                idx++;
            }
        }
        //compare reputation
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (newArray[i] == a[j]) {
                    counter++;
                }
            }
            if (counter >= temp) {
                temp = counter;
                mostOccurredNumber = newArray[i];
            }
            counter = 0;
        }
        return mostOccurredNumber;
    }
    static int repme(int[] a){
        int length=a.length;

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    length--;
                    break;
                }
            }
        }

        int k=0;
        int[] c=new int[length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    c[k]=a[i];
                    k++;
                }
            }
        }
        int[] item=new int[k];
        int itemsam=0;
        for(int f=0;f<item.length;f++){
            item[f]=c[f];
            itemsam=item[f];

        }
        return itemsam;
    }
}
