class A extends Thread{
    
    @Override
    public void run()
    {
        int i;
        for(i=0;i<10;i++)
        {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (Exception e) {
                System.out.println("Error Occurred.");
            }
        }
    }
}

public class threadexample2 {
    public static void main(String[] args) {
        A th1 = new A();
        A th2 = new A();

        th1.start();
        th2.start();


    }
}
