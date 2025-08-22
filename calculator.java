import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        char op = in.next().charAt(0);
        double b = in.nextDouble();

        switch(op) {
            case '+': System.out.println("Result: " + (a + b)); break;
            case '-': System.out.println("Result: " + (a - b)); break;
            case '*': System.out.println("Result: " + (a * b)); break;
            case '/': 
                if(b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Error: Division by zero");
                break;
            default:
                System.out.println("Invalid operator");
        }
        in.close();
    }
}
