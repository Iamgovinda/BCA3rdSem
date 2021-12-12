public class ThreadExample extends Thread{
    @Override
    public void run()
    {
        System.out.println("Running....");
        for(int i=0;i<=10;i++)
        {
            System.out.println(i);
            try{
                sleep(1000);
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args)
    {
        ThreadExample th1=new ThreadExample();
        ThreadExample th2=new ThreadExample();
        th1.start();
        th1.setName("ThreadOne!");
        System.out.println(th1.getId());
        System.out.println(th1.getName());
        th2.start();
        th2.setName("ThreadTwo!");
        System.out.println(th2.getId());
        System.out.println(th2.getName());
        System.out.println(th2.getId());
    }
}