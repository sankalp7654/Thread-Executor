
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;



public class SynchronisedThreads {

    public static void main(String [ ] args  ){
        
                ExecutorService executor = Executors.newFixedThreadPool(2);
                
                for(int i=0 ; i< 5 ; i++){
                    executor.submit(new myThread(i));
                }
         executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException ex) {
            Logger.getLogger(SynchronisedThreads.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Completed Successfully");
    }
    
}
