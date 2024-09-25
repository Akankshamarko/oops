package assingnment2;

class Complex {
    public static void f1() {
        System.out.println(
                "f1 method of the Complex class is executed.");
    }
}

class Sample extends Complex {
    public static void f1() {
        System.out.println(
                "f1 of the Sample class is executed.");
    }
}

public class methodhiding {

    public static void main(String args[]) {
        Complex d1 = new Complex();

        Complex d2 = new Sample();

        // But here method will be call using type of
        // reference
        d1.f1();
        d2.f1();
    }
}
