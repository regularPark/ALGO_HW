import java.util.*;

public class Timer {

     public long startTime() {
         return System.currentTimeMillis();
     }

     public long endTime() {
         return System.currentTimeMillis();
     }

     public void duration() {
         System.out.println(endTime() - startTime());
     };

}
