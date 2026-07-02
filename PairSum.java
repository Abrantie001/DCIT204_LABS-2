import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the array size: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }

            System.out.print("Enter the Target Sum: ");
            int target = scanner.nextInt();

            boolean found = false;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] + arr[j] == target) {
                        System.out.println("\nPair found:");
                        System.out.println("Indices: " + i + " and " + j);
                        System.out.println("Values: " + arr[i] + " and " + arr[j]);
                        System.out.println("Equation: " + arr[i] + " + " + arr[j] + " = " + target);
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }

            if (!found) {
                System.out.println("\nNo pair found that equals the target sum.");
            }
        }
    }
}