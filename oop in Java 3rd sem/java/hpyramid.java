

import java.util.Scanner;

public class hpyramid {
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter the hight of triangle : ");
        int height = sc.nextInt();

        for(int i=1;i>=height;i++){
            for(int j = height-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int k = 1; k<= (i*2-1) ; k++){
 
                  System.out.print("     pagal ");
            }
            System.out.println("");
        }

       for(int i=height;i>=1;i--){
           for(int j = height-i;j>=0;j--){
               System.out.print(" ");
           }
           for(int k = 1; k<= (i*2-1) ; k++){

                 System.out.print("    pagal ");
           }
           System.out.println("");
       }


        
    }
    
}
