import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;

/**@
 * @author Guilherme Munaretto
 * @date 11/04/2018
 *
 */

public class Processor{
  private int[] optimalResults;
  private int[] subOptimalResults;

    /**@
     *
     */
  public Processor(){
    optimalResults = new int[10];
    subOptimalResults = new int[10];
  }

    /**@
     * Method responsible for computing the maximum size set with no conflicts between the intervals. At the end of
     * its execution, returns an optimal solution.
     * @param set the interval set where the algorithm is going to operate.
     */
  public void optimalAlgorithm (TreeSet<Interval> set){

  }

    /**@
     * Method responsible for computing the maximum size set with no conflicts between the intervals. At the end of its
     * execution, returns a suboptimal solution.
     * @param set the interval set where the algorithm is going to operate.
     */
  public void subOptimalAlgorithm (TreeSet<Interval> set){

  }

    /**@
     * Method responsible for calculation the average between the results given by both 'optimalAlgorithm' or
     * 'subOptimalAlgorithm' methods.
     * @param results the array containing the outputs of both 'optimalAlgorithm' or 'subOptimalAlgorithm' methods.
     * @return an Integer with the average between the results given by both 'optimalAlgorithm' or
     * 'subOptimalAlgorithm' methods.
     */
  public double average (int[] results){
      double sum = 0.0;
      for(short i = 0; i < 10; i++){

      }
      return sum/10;
  }

    /**@
     *
     * @param results
     * @return
     */
  public double stdDeviation (int[] results){
      double sum = 0.0;
      for(short i = 0; i < 10; i++){

      }
      return sum;
  }

    /**@
     *
     * @param path
     */
  public void writeResults (String path){

  }
}
