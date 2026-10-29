package Assignment7;

public class LargestNumberArray {
    public static void main(String[] args) {

        int[] a = {10, 25, 5, 40, 15};

        int largest = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }

        System.out.println("Largest number is: " + largest);
    }
}