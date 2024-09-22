import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("ENTER THE celsius  VALUE =");
        float d = sc.nextFloat();
       
        float fahrenheit = (  d*9/5)+32;
        System.out.println("the fahrenheit value is ="+ fahrenheit);
    }
    
}
