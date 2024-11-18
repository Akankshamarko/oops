
//write a programm to demonstrate the this keyword 


public class keyword {
    int rollNo;
    String name ;

     keyword (int rollNo,String name ){
        this.rollNo = rollNo;
        this.name = name;
     }
     void display(){
        System.out.println("roll no:"+ this.rollNo);
        System.out.println(" name: "+ this.name );
     }
     public static void main(String[] args) {
        keyword  keyword1 = new keyword(06, "akanksha");
        keyword1.display();
     }
    
}
