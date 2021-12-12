class StringMethod{
    static String name="Netes Mahat ";
    static String name1=" Reeya";
    public static void main(String[] args)
    {
        System.out.print("name: " + name);
        System.out.print("\nBig_name: " + name.toUpperCase());
        System.out.print("\nSmall_name: " + name.toLowerCase());
        System.out.print("\nConcated name: " + name.concat(name1));
        System.out.print("\nSub String: " + name.substring(6));
        System.out.print("\nSub String: " + name.substring(6,9));
        System.out.print("\nReplaced String: " + name.replace("Mahat", "Moti"));
        System.out.print("\nIndex of String: " + name.indexOf("a"));
        System.out.print("\nBolaen Isempty(): " + name.isEmpty());

    }
}