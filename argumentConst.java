package assingnment2;

import java.io.*;

class argument {
    String name;
    int id;

    argument( ) {
        this.name = name;
        this.id = id;
    }
}

public class argumentConst {
    public static void main(String[] args) {
        argument a1 = new argument();
        a1.name = "akanksha";
        a1.id =  06;
        
        System.out.println(a1.name+ a1.id);
    }

}
