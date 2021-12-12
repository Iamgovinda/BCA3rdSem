public class passbyreference {
    void display(int arry[])
    {
        arry[0]=arry[0]+100;
        System.out.println("Inside the method number is: "+ arry[0]);
    }

    public static void main(String[] args)
    {
        passbyreference obj=new passbyreference();
        int array[]={100,200};
        System.out.println("First number of array before calling a method is: "+ array[0]);
        obj.display(array);
        System.out.println("first number of array before calling a method is: "+ array[0]);
    }
}
