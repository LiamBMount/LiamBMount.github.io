import java.util.*;

class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A for addition, S for subtraction");
        boolean isValid = false;
        String input1 = scanner.nextLine();
        while (!isValid) {
            if (input1.equals("A") || input1.equals("S")) {
                isValid = true;
            } else {
                System.out.println("Please enter valid input. " + input1 + " is not valid.");
                input1 = scanner.nextLine();
            }
        }
        System.out.println("Enter your first number: ");
        isValid = false;
        int input2 = 0;
        while (!isValid) {
            try {
                input2 = scanner.nextInt();
                isValid = true;
            } catch (Exception e) {
                System.out.println("Please enter valid input. That is not a number.");
                isValid = false;
                scanner.nextLine();
            }


        }
        System.out.println("Enter your second number");
        int input3 = 0;
        isValid = false;
        while (!isValid) {
            try {
                input3 = scanner.nextInt();
                isValid = true;
            } catch (Exception e) {
                System.out.println("Please enter valid input. That is not a number.");
                scanner.nextLine();
                isValid = false;
            }

        }
        scanner.close();
        if (input1.equals("A")) {
            int result = input2 + input3;
            System.out.println(input2 + " + " + input3 + " = " + result);
        } else {
            int result = input2 - input3;
            System.out.println(input2 + " - " + input3 + "=" + result);
        }

    }
}





