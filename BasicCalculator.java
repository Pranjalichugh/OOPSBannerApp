import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter number 2: ");
        double number2 = scanner.nextDouble();
        double sum = number1 + number2;
        double sub = number1 - number2;
        double mult = number1 * number2;
        double div = number1 / number2;
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
            + number1 + " and " + number2 + " is " + sum + ", " + sub + ", " 
            + mult + ", and " + div);
        scanner.close();
    }
}
