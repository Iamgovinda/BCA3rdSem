package java;

import java.util.Scanner;

public class sumofarrayelement {
    public static void main(String[] args)
    {
        int arr[5];

        Scanner reader=new Scanner(System.in);

        for(int i=0;i<5;i++)
        {
            arr[i]=reader.nextInt();
        }

        for(int number=0;number<5;number++)
        {
            System.out.println(arr[number]);
        }
    }
}
