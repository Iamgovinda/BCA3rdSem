import java.util.ArrayList;

import javax.print.event.PrintEvent;

public class Datacollection{
    public static void main(String[] args)
    {
        //ArrayList<String> list=new ArrayList<>();
        ArrayList list=new ArrayList<>();

        list.add("ram");
        list.add("Shyam");
        list.add("gyani");
        list.add("Gita");
        list.add("Sita");
        list.add(5);
        list.add(6);

        System.out.println(list);

        // for(String name:list)
        // {
        //     System.out.println(name);
        // }
        list.remove("Gita");
        list.remove("5");

        System.out.print(list);

    }
}