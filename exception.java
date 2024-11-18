import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        int [] marks  = new int [3];
        marks [0] =7;
        marks [1] = 8;
        marks [2] = 56;
        

        Scanner sc = new Scanner(System.in);


        System.out.println("enter array of index" );
        int ind = sc.nextInt();
        System.out.println("enter the number ");
        int number = sc.nextInt();
        try{
            System.out.println("the value at index entered is "+ marks[ind]);
            System.out.println("the value of array-value/number is:" + marks[ind]/number);
        }
        catch(Exception e){
            System.out.println(" SOME exception occourd");
            System.out.println(e);

        }
    }
    
}
