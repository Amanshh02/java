public class patterns_lec_5 {
    public static void main(String[] args) {
        //SOLID RECTANGLE
        for(int i = 0 ; i <= 4 ; i++){
            for(int j = 0 ; j <= 4; j++ ){
                System.out.print(" * ");
            }
            System.out.println("\n");
        }

        System.out.println("\nHollow rectangle\n"); 

        //Hollow rectangle
        // 4 x 5 matrix
        int n = 4 ;
        int m = 5 ;
        // we track the boundary 
        for(int i = 1 ; i<=n ; i++){
            for (int j = 1; j <= m; j++){
                //inside the cell
                if (i == 1 || j == 1 || i ==n || j == m) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }

        System.out.println("\nHalf pyramid\n");
        //row num becomes the total columns
        //this will give us a half pyramid
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }

    }
}
