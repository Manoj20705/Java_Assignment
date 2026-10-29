package Assignment7;

public class CountEvenOddArray {
    public static void main(String[] args) {

        int[] a = {10, 15, 20, 25, 30, 35, 40};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}