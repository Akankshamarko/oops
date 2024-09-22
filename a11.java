
import java.util.Scanner;
public class a11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reverse =0;
        System.err.println("enter the number ");
        int num = sc.nextInt();
        while (num>0){
            int remainder = num%10;
            reverse = reverse*10 +remainder;
            num = num/10;
        }
        System.out.println(" the reverse number is"+" "+ reverse);
    }
    
}
