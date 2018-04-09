import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Guilherme Munaretto
 * @date 2018-04-08
 * This class is responsable for generating a set of 10^6 random intervals between 0 and 1000, so that the final time
 * of each interval is always bigger than its inicial time.
 */

public class IntervalGenerator{
  private final int INICIAL_BEGINNING_TIME = 0;
  private final int INICIAL_ENDING_TIME = 1000;
  private final int FINAL_BEGINNING_TIME = 1;
  private final int FINAL_ENDING_TIME = 1000;
  private TreeSet<Interval> intervalSet;

    /**
     * Constructor method of the class. Initializes the "intervalSet" to be used by the method "generateInterval"
     */
  public IntervalGenerator(){
    intervalSet = new TreeSet<>();
  }

  public TreeSet generateInterval(){

    for(int i = 0; i < 10; i++){
      int start = (int) (Math.random()*(INICIAL_ENDING_TIME - INICIAL_BEGINNING_TIME)) + INICIAL_BEGINNING_TIME;
      int end = (int) (Math.random()*(FINAL_ENDING_TIME - FINAL_BEGINNING_TIME)) + FINAL_BEGINNING_TIME;

      while(start > end){
          end = (int) (Math.random()*(FINAL_ENDING_TIME - FINAL_BEGINNING_TIME)) + FINAL_BEGINNING_TIME;
      }
      intervalSet.add(new Interval(start,end));
    }


    return intervalSet;
  }
}
