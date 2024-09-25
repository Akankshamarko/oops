package assingnment2;
import java.io.*;
import java.util.Scanner;
class a{
    
    void  show (){
     int i=2;
     System.out.println(i);
    }

    }
      class b extends a{
        int j;
        void show1 (int j){
          this.j=j;
          System.out.println(j);
        }
      }                                          

public class inheri1 {
    public static void main(String[] args) {
      int i;
      Scanner sc=new Scanner(System.in);
      i=sc.nextInt();
      b b1=new b();
      b1.show1(i);
      b1.show();
    }
}
