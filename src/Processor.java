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
     * Method responsible for calculation the average between the results given by 'optimalAlgorithm' or
     * 'subOptimalAlgorithm' methods.
     * @param results the array containing the outputs of 'optimalAlgorithm' or 'subOptimalAlgorithm' methods.
     * @return an Integer with the average between the results given by 'optimalAlgorithm' or
     * 'subOptimalAlgorithm' methods.
     */
  public double average (int[] results){
      double sum = 0.0;
      for(short i = 0; i < results.length -1; i++){
        sum += results[i];
      }
      return sum/results.length;
  }

    /**@
     * This method is responsible for calculating the standard deviation between the results given by
     * 'optimalAlgorithm' and 'subOptimalAlgorithm' methods.
     * @param results the array containing the outputs of 'optimalAlgorithm' or 'subOptimalAlgorithm' methods.
     * @return an Integer with the average between the results given by 'optimalAlgorithm' or
     * 'subOptimalAlgorithm' methods.
     */
  public double stdDeviation (int[] results){
      double sum = 0.0;
      double avg = average(results);
      for(short i = 0; i < results.length -1; i++){
        sum += Math.pow((results[i] - avg),2);
      }
      return Math.sqrt(sum/3);
  }
}
