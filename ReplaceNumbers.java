public class ReplaceNumbers {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {10, 15, 22, 33, 44, 55};

        System.out.println("Original Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Replace even with 1 and odd with 0
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] = 1; // Even → 1
            } else {
                numbers[i] = 0; // Odd → 0
            }
        }

        System.out.println("\nModified Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}