package assingnment2;
class xyz{
    String name;
    int id;
    xyz(String name, int id ){
        this.name = name;
        this.id = id;
    }
}

public class paraConst {
    public static void main(String[] args) {
        xyz b1 = new xyz("akanksha ", 06);
        System.out.println("name is "+ b1.name+ b1.id );
    }
    
}
