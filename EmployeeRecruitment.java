
    import java.util.Scanner;
    
class TooYoungException extends Exception {
    public TooYoungException(String message) {
        super(message);
    }
}


class TooOldException extends Exception {
    public TooOldException(String message) {
        super(message);
    }
}


    public class EmployeeRecruitment {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            try {
            
                System.out.print("Enter candidate's name: ");
                String name = scanner.nextLine();
                
                
                System.out.print("Enter candidate's age: ");
                int age = scanner.nextInt();
                
                
                if (age < 20) {
                    throw new TooYoungException("Candidate is too young for the job.");
                } else if (age > 45) {
                    throw new TooOldException("Candidate is too old for the job.");
                } else {
                    
                    System.out.println("Candidate is eligible for the job.");
                    System.out.println("Name: " + name);
                }
            } catch (TooYoungException | TooOldException e) {
                
                System.out.println("Error: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }
     

