package Choosen;

public class characterOrdination {
    public static void main(String[] args) {
        System.out.println(characterOrdination(new char[]{'a','b','c'},1,2));
        System.out.println(characterOrdination(new char[]{'a','b','c'},0,4));
    }

    static char[] characterOrdination(char[] a, int start, int length) {
        if (length < 0 || start < 0 || start + length - 1 >= a.length) {
            return null;
        }
        char[] sub=new char[length];
        for(int i=start,j=0;j<length;i++,j++){
            sub[j]=a[i];
        }
        return sub;
    }
}
