public class Fibonacci {
    public static int fibRecursive(int n) {
        if (n<= 1) {
            return n;
        }
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public static int fibIterative(int n) {
        if (n <= 0) {
            return n;
        }
        int x = 0;
        int y = 1;
        for (int i = 2; i <= n; i++) {
            int z = x + y;
            x = y;
            y = z;
        }
        return y;
    }
}

class DecimalBinaryConversion {
    public static String binaryConversionRecursive(int n) {
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        return binaryConversionRecursive(n/2) + (n % 2);
    }

    public static String binaryConversionIterative(int n) {
        if (n == 0) {
            return "0";
        }
        String binary = "";
        while (n > 0) {
            binary = (n % 2) + binary;
            n /= 2;
        }
        return binary;
    }

}

class Main {
    public static void main (String[]args) {
        int n = 10;

        System.out.println(Fibonacci.fibRecursive(n));
        System.out.println(Fibonacci.fibIterative(n));

        System.out.println(DecimalBinaryConversion.binaryConversionRecursive(n));
        System.out.println(DecimalBinaryConversion.binaryConversionIterative(n)); 
    }
} 
