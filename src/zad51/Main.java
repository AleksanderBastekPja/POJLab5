package zad51;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int i = 2;
        int p = 0;
        ArrayList<Integer> primeArray = new ArrayList<Integer>();

        while (p < 50) {
            if (isPrime(i, 2)) {
                primeArray.add(i);
                p++;
            }
            i++;
        }
        System.out.println(primeArray);
    }
    public static boolean isPrime(int n, int d) {
        if (n == d) {
            return true;
        } else if (n % d == 0) {
            return false;
        }
        return isPrime(n, d+1);
    }
}