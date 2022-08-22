package Questions;

public class Question4 {
    public static void main(String[] args) {

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

    static int isPrime(int i) {
        return 0;
    }
}
