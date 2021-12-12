

class HelloWorld {
    int a=2;
    int b=1;
    int c=0;
    int max;
        public static void main(String[] args) {
        HelloWorld obj= new HelloWorld();

         if (obj.a>obj.b)
         {
             if (obj.a>obj.c)
             {
                 obj.max=obj.a;
             }
             else{
                 obj.max=obj.c;
             }
         }
         else
         {
             if(obj.b>obj.c)
             {
                 obj.max=obj.b;
             }
             else
             {
                 obj.max=obj.c;
             }
         }

        // obj.max=obj.c;

        
        
        System.out.println("Greatest between " + obj.a + "," + obj.b + "," + obj.c + " is " + obj.max);


    }
}