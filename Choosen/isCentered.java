package Choosen;

public class isCentered {
    public static void main(String[] args) {
        int[] array = {1, 2, 0, 4, 5};
        System.out.println(isCentered(array));
    }

    static int isCentered(int[] a) {
        int middleelement = a.length / 2;
        if (a.length % 2 == 0 || a.length == 0) {
            return 0;
        }
        for (int i = 0; i < a.length; i++) {
            if (i != middleelement && a[middleelement] > a[i]) {
                return 0;
            }
        }
        return 1;
    }
}
