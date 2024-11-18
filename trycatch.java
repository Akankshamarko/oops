





public class trycatch {
    public static void main(String[] args) {
         try{
            int [] arr = new int[-5];

         }
         catch(NegativeArraySizeException e){
            System.out.println("caught negativeArraySizeExecption:"+e.getMessage());
         }
         try{
            int result = 10/0;

         }catch(AbstractMethodError e){
            System.out.println("caught ArethematicExecption:"+e.getMessage());
         }
         System.out.println(" program continues after handling Execption ");
    }
    
}
