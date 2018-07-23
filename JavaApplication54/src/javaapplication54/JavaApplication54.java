package javaapplication54;

public class JavaApplication54 
{
    public static void main(String[] args) throws Exception
    {
      Thread t1 =new Thread(()->
               {
            for (int i = 1; i <= 5; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                };
            }
        });                  //lambda multithreadung
        Thread t2 =new Thread(()->
                {
            for (int i = 1; i <= 5; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                };
            }
        });
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
//        
//        System.out.println("bye bye");
//        
if(t1.isAlive()==true)  //in case on false bye is not printing 
{
    System.out.println("  ");
    }  
else 
{
    System.out.println(" bye bye");
}
    }
    
}
