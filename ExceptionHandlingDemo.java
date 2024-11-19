public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
        
            int[] arr = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
    
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

