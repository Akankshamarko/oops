interface  printable {
    void print ();
    //differecae bitwwen abstract class and interface 
    
}
interface showable {
    void show();
}
class A7 implements printable,showable{
    public void print (){
        System.out.println("hello");
    }
public void show(){
    System.out.println("welcome");
}
  public static void main(String[] args) {
    A7 sc = new A7();
    sc.print();
    sc.show();
  }  

}
