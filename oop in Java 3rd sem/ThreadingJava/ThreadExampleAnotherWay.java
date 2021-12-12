public class ThreadExampleAnotherWay implements Runnable {
    @Override
    public void run(){
        System.out.println("Running....");
        for(int i=0;i<=10;i++)
        {
            System.out.println(i);

            try{
                Thread.sleep(1000);
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }

    }
    public static void main( String[] args)
    {
        ThreadExampleAnotherWay th2=new ThreadExampleAnotherWay();

        Thread thread1= new Thread(th2);

        ThreadExampleAnotherWay th3= new ThreadExampleAnotherWay();

        Thread thread2 = new Thread(th3);

        thread1.start();
        thread2.start();



    }
}
