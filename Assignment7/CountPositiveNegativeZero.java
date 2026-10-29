package Assignment7;

public class CountPositiveNegativeZero {
    public static void main(String[] args) {

        int[] a = {10, -5, 0, 20, -15, 0, 8, -2};

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] > 0) {
                positiveCount++;
            } else if (a[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);
        System.out.println("Zeros count: " + zeroCount);
    }
}