import java.util.Scanner;

public class EvenNumberInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
             
                System.out.print("Enter the first number: ");
                int num1 = scanner.nextInt();

                System.out.print("Enter the second number: ");
                int num2 = scanner.nextInt();

                if (num1% 2 == 0 && num2 % 2 == 0) {
                    System.out.println("Both are even: " + num1 + " and " + num2 + "");
                    break;
                } else {
                    System.out.println("Both numbers must be even. Please try again.");
                }

        scanner.close();
    }
}
 
}
