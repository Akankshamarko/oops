
import java.util.Scanner;
public class a6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year");
        int year = sc.nextInt();
        if (year%4==0){
            System.out.println("year is leap year");

        }
        else{
            System.out.println(" year is not leap year ");
    
        }
    }
    
}
