import java.util.Scanner;
public class a8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        int den = sc.nextInt();

        if (num%den ==0){
            System.out.println(num+"number is divisble by "+den);
        }
        else{
            System.out.println(num+"number is not  divisble by "+den);
        }
    }
    
}
