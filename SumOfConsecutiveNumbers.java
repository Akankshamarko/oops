public class SumOfConsecutiveNumbers {
    public static void main(String[] args) {
        String input = "2415"; 
        int sum = findSumOfConsecutiveNumbers(input);
        System.out.println("Sum of numbers formed by consecutive digits: " + sum);
    }

    public static int findSumOfConsecutiveNumbers(String input) {
        int sum = 0;

        for (char ch : input.toCharArray()) {
            int number = Character.getNumericValue(ch);
            sum += Math.pow(number, 3); 
        }

        return sum;
    }
}
