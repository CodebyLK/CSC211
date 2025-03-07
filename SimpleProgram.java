package homework5;

public class SimpleProgram {

    public static int[] arrayEvens() {
        int[] evens = new int[10];
        int index = 0;
        for(int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                evens[index] = i;
                index++;
            }
        }
        return evens;
    }

    public static double numSquare(int num) {
        return Math.pow(num, 2);
    }
    
}
