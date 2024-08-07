public class ChToStr {
    public static void main(String[] args) {
        String str = " the javiour ";
         int index = 5;
         char ch = 'S';

         System.out.println(" orignal string ="+ str);
         str = str.substring(0, index) + ch + str.substring(index+1);
         System.out.println( " modifie string=" +" "  +str);
    }
    
}
