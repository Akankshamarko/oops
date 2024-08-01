public class isPrime {
    public static void main(String[] args) {
        int a=56;
        for(int i=2;i<a;i++){
            if(a%i==0){
                System.out.println("it is not prime");
                break;
            }
            else{
                System.out.println("it is prime");
            }
        }
        
    }
}
