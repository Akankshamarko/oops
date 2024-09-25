//package MYBAG; 
//java.io.printstream; 
class myEmployee{
 
 private int id ;
 private String name;


public String getName(){
    return name;
}
public void setName( String  n){
   this.name =n;
}
public void setId( int i){
    id = i;
    //if(id>0){
       // System.out.println(" you have no id ");
   // }
}
public int getId(){
    return id;
}
}
public class gettersetter {
    public static void main(String[] args) {
     myEmployee e1 = new myEmployee();
     e1.setId(06);
     e1.setName(" akanksha ");
     System.out.println(e1.getName());
     System.out.println(e1.getId());
    }

    
}
