//class inherited from "Thread"
class ThreadClassDemo extends Thread {
   private int number;
   public ThreadClassDemo(int number) {   // class constructor
      this.number = number;
   }
   public void run() {
      int counter = 0;
      do {
         try
         {
            Thread.sleep(1000);
         }
         catch(Exception e)
         {
            System.out.println("Exception");
         }
         System.out.println( "From Thread "+number+" counter:"+counter++);

      } while(counter<=6);
      System.out.println("** Thread " +number+" Finished.....executed  " + counter + " times.");
   }
}
public class Main {
   public static void main(String [] args) {
      System.out.println("main() started...");
      System.out.println("Starting thread_1...");
      Thread thread_1 = new ThreadClassDemo(1);
      System.out.println("Starting thread_2...");
      Thread thread_2 = new ThreadClassDemo(2);
      thread_1.start();
      thread_2.start();
      System.out.println("main() is ending...");
   }
}