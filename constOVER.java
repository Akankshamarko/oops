package assingnment2;

import java.io.*;

class box {
    double width;
    double heigth;
    double depth;

    box(double width, double heigth, double depth) {
        this.width = width;
        this.heigth = heigth;
        this.depth = depth;
    }

    box() {
        width = 1;
        heigth = 1;
        depth = 1;
    }

    box(double length) {
        heigth = width = depth = length;
    }

    double volume() {
        return width * depth * depth;
    }

}

public class constOVER {
    public static void main(String[] args) {
        box b1 = new box(8, 8, 6);
        box b2 = new box();
        box b3 = new box(7);
        double vol;
        vol = b1.volume();
        System.out.println(" valume of b1 " + vol);
        vol = b2.volume();
        System.out.println(" valume of b2 is " + vol);
        vol = b3.volume();
        System.out.println("value of b3 is " + vol);
    }

}
