package Choosen;

public class Q19_findProcupineNumber {
    public static void main(String[] args) {
        System.out.println(findProcupinNumber(0));
    }

    static int findProcupinNumber(int n) {
        int procupineNumber = 0;
        int maxValue = Integer.MAX_VALUE;
        boolean isPocupineNumber = false;
        n++;
        while (n <= maxValue) {
            if (isPocupineNumber) {
                if (isPrime(n) == 1) {
                    if (n % 10 == 9) {
                        break;
                    } else {
                        isPocupineNumber = false;
                    }
                }
            } else {
                if (isPrime(n) == 1) {
                    if (n % 10 == 9) {
                        isPocupineNumber = true;
                        procupineNumber = n;
                    }
                }
            }
            n++;
        }
        return procupineNumber;
    }

    static int isPrime(int number) {
        int isPrime = 0;
        if (number > 1) {
            isPrime = 1;
            for (int divider = 2; divider < number; divider++) {
                if (number % divider == 0) {
                    isPrime = 0;
                    break;
                }
            }
        }
        return isPrime;
    }

}
