public class fabonacci {
     public static void main(String[] args) {
        long a=0;
        long b=1;
        long temp;
        

        System.out.print(a + "\n" + b + "\n");

        for(int i=2;i<=10;i++)
        {
            temp=a+b;
            a=b;
            b=temp;
            System.out.println(temp);
        }


    }
}
