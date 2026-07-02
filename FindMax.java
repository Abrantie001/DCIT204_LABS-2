import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }

            int maxVal = arr[0];
            int maxIndex = 0;

            for (int i = 1; i < n; i++) {
                if (arr[i] > maxVal) {
                    maxVal = arr[i];
                    maxIndex = i;
                }
            }

            System.out.println("\n--- Results ---");
            System.out.println("Maximum Value: " + maxVal);
            System.out.println("Index of Maximum: " + maxIndex);
        }
    }
}