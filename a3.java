public class a3 {
    public static int max ( int a, int b, int c){
        if ((a>=b)&&( a>=c)){
            return a;
        }
        else if ( b>=c){
            return b;
        }
        else {
            return c;
        }
    }
    public static void main(String[] args){
        int a,b,c;
        a = 32;
        b =44;
        c = -4;
        System.out.println("maximum"+ " " +  max(a, b, c));
    

    }
}
