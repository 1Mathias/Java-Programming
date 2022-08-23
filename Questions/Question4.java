package Questions;

public class Question4 {
    public static void main(String[] args) {
        System.out.println(isprimeproduct(21));
    }
    static int isprimeproduct(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0 && isPrime(i)) {
                for (int j = i + 1; j < n; j++)
                    if (n % j == 0 && isPrime(j)) {
                        if (i * j == n)
                            return 1;
                    }
            }
        }
        return 0;
    }
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        // there is no number that can be completely divided by more than half of the number itself.
        for (int i = 2; i < num/2; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }
}

//primeproduct function
