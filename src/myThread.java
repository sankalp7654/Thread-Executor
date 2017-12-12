
import java.util.logging.Level;
import java.util.logging.Logger;

public class myThread implements Runnable{

private final int getValue;

public myThread (int i ){
        getValue = i;
}     

    @Override
    public void run (){
     
      System.out.println("Starting " + getValue);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException ex) {
        Logger.getLogger(myThread.class.getName()).log(Level.SEVERE, null, ex);
    }
      System.out.println("Task Completed ..." + getValue);
        
}
    
 
}
