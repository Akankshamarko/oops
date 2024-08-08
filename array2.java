public class array2 {
    public static void main(String[] args) {
        int rows =4;
        int colums = 4;
        int [][] arr= new int [rows][colums];
        int value  =0;
        for( int i=0; i<rows; i++){
            for(int j=0; j<colums; j++){
                arr[i][j]= value;
                value++;

            }
        }  
        System.out.println("the 2D array is :");
        for( int i=0; i<rows; i++){
            for(int j=0; j<colums; j++){
System.out.print(arr[i][j] +" ");
            }System.out.println();
        
        }
                 
    }
    
}
