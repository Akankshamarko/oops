import java.util.Scanner;
public class a5 {
    public static void main(String[] args) {
        Double km,miles;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter miles");
        miles = sc.nextDouble();
        km=miles*1.609;
        System.out.println("kilometer"+" "+km );
    }
    
}
