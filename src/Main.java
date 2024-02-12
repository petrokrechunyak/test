import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int firstOperand, secondOperand;
        String action;
        try {
            firstOperand = Integer.parseInt(readLine("first value"));
            action = readLine("action");
            secondOperand = Integer.parseInt(readLine("second value"));
        } catch (NumberFormatException e) {
            System.out.println("Unable to parse number!");
            return;
        }

        int result = 0;
        switch (action) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                result = firstOperand / secondOperand;
                break;
            case "%":
                result = firstOperand % secondOperand;
                break;
        }
        System.out.printf("Result is %d", result);
    }
    
    private static String readLine(String readValue) {
        System.out.printf("Enter %s: ", readValue);
        return SCANNER.nextLine();
    }
}