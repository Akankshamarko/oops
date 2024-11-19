
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}

class Bulldog extends Dog {
    public void snore() {
        System.out.println("The bulldog snores loudly.");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        
        Bulldog myBulldog = new Bulldog();


        myBulldog.eat();
        myBulldog.bark();
        myBulldog.snore();
    }
}

