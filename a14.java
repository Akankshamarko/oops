import java.util.Scanner;
//genrate the multiple table 
public class a14 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int num = sc.nextInt();
        for (int i =1; i<=10; i++){
            System.out.println(num +"*"+i+"="+num*i);
        }
    }
}
