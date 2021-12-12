

import java.util.Scanner;

public class pyramid {
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter the hight of triangle : ");
        int height = sc.nextInt();
        int temp=height;
        

       for(int i=1;i<=height;i++){
           for(int j = height-i;j>=0;j--){
               System.out.print(" ");
           }
           for(int k = 1; k<= (i*2-1) ; k++){

                 System.out.print("pagal ");
           }
           System.out.println("");
       }


    for(int i=temp-1;i>=1;i--){
        for(int j = temp-i;j>=0;j--){
            System.out.print(" ");
        }
        for(int k = 1; k<= (i*2-1) ; k++){

              System.out.print("pagal ");
        }
        System.out.println("");
    }
        
    }
    
}
