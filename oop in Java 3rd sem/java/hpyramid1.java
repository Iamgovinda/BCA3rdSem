

import java.util.Scanner;

public class hpyramid1 {
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter the hight of triangle : ");
        int height = sc.nextInt();
       for(int i=height;i>=1;i--){
           for(int j = height-i;j>=0;j--){
               System.out.print(" ");
           }
           for(int k = 1; k<= (i*2-1) ; k++){
               if(k%2 == 0){
                   System.out.print(" # ");
               }
               else
                 System.out.print(" * ");
           }
           System.out.println("  ");
       }
        
    }
    
}
