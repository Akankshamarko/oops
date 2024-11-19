
class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super();
    }
}


public class EquationCalculator {
    public static void main(String[] args) {
        try {
            
            double result = calculateEquation("10 / 0");
            System.out.println("Result: " + result);
        } catch (CustomArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static double calculateEquation(String equation) throws CustomArithmeticException {
        try {
            
            String[] parts = equation.split(" ");
            double num1 = Double.parseDouble(parts[0]);
            String operator = parts[1];
            double num2 = Double.parseDouble(parts[2]);

            
            switch (operator) {
                case "+":
                    return num1 + num2;
                case "-":
                    return num1 - num2;
                case "*":
                    return num1 * num2;
                case "/":
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    return num1 / num2;
                default:
                    throw new CustomArithmeticException("Invalid operator: " + operator);
            }
        } catch (ArithmeticException | NumberFormatException e) {
            throw new CustomArithmeticException(e.getMessage());
        }
    }
}

