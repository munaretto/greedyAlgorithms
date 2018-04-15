import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Guilherme Munaretto
 * @date 2018-04-08
 * This class was designed to deal with every aspect of the interval sets used during the application, such as
 * generating the right amount of interval sets to the 'Processor' class and exporting all intervals of a set
 * to a txt file.
 */

public class IntervalGenerator{
  IntervalFactory factory;

    /**
     * Constructor method of the class, responsible for initializing the IntervalFactory, used to store and generate
     * the interval sets.
     */
  public IntervalGenerator(){
    factory = new IntervalFactory();
  }

  /**@
   * This method is responsible for generating 10 interval sets, each one with 10^6 elements. This is possible due the
   * calling of IntervalFactory function.
   * @return
   */
  public TreeSet[] generateIntervalSet(){
    TreeSet[] sets = new TreeSet[10];
    for (short i = 0; i <= sets.length - 1; i++){
        sets[i] = factory.getIntervalSet();
    }
    return sets;
  }

}
