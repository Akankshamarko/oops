
class TooHotException extends Exception {
    public TooHotException(String message) {
        super(message);
    }
}

class TooColdException extends Exception {
    public TooColdException(String message) {
        super(message);
    }
}

    public class TemperatureCheck {
        public static void main(String[] args) {
            if (args.length != 1) {
                System.out.println("temperature ");
                return;
            }
    
            try {
                
                double temperature = Double.parseDouble(args[0]);
                
                
                if (temperature > 35) {
                    throw new TooHotException("Temperature is too hot!");
                } else if (temperature < 5) {
                    throw new TooColdException("Temperature is too cold!");
                } else {
                    
                    double fahrenheit = (temperature * 9/5) + 32;
                    System.out.println("Temperature is normal.");
                    System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                }
            } catch (TooHotException | TooColdException e) {
                
                System.out.println("Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                
                System.out.println("Please provide a valid number for the temperature.");
            }
        }
    }
    

