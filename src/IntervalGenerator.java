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
  private TreeSet[] sets;
  IntervalFactory factory;

    /**
     * Constructor method of the class, responsible for initializing the TreeSet and IntervalFactory used,
     * respectively, to store and generate the interval sets.
     */
  public IntervalGenerator(){
    sets = new TreeSet[10];
    factory = new IntervalFactory();
  }

    /**@
     * This method is responsible for generating 10 interval, each one with 10^6 elements. This is possible due the
     * calling of IntervalFactory.
     */
  public void generateIntervalSet(){
    for (short i = 0; i < sets.length - 1/ i++;){
        sets[i] = factory.getIntervalSet();
    }
  }

    /**@
     * This method is in charge of export all the elements of a given set to a text file, associated with a path.
     * @param set the set from which the method is going to read and export the date.
     * @param path where the destination file can be found in the computer.
     */
  public void writeIntervalSet (String path, TreeSet<Interval> set){

  }
}
