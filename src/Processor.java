import java.util.ArrayList;
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
  private IntervalGenerator intGen;
  private TreeSet<Interval>[] intervalSet;

    /**@
     *
     */
  public Processor(){
        intGen = new IntervalGenerator();
        intervalSet = intGen.generateIntervalSet();
  }

    /**
     *
     * @return
     */
  public TreeSet[] getIntervalSet(){return intervalSet;}

    /**
     *
     */
  public void optimalAlgorithm (){
    // Going through the set array, and computing, at every index, the optimal solution
    for(short i = 0; i < intervalSet.length; i++){//TODO O(n) [10 iterations]
        // ArrayList where the current selected intervals will be stored at each iteration of the first for loop
        ArrayList<Interval> selectedIntervals = new ArrayList<>();
        // A reference to the interval set at the index i
        TreeSet<Interval> aux = intervalSet[i];
        // Iteration all 10^6 intervals and checking how many doesn't overlap for index i interval set
        for(Interval in : aux){ //TODO O(m) [10^6 iterations]
            /*
             * If the selected intervals array is empty, or the current interval doesn't overlap with any of
             * the intervals within it, then the current interval is added to it.
             */
            if(selectedIntervals.size() == 0 || isCompatible(in,selectedIntervals)){//TODO O(k) [10^6 iterations]
                selectedIntervals.add(in);
            }
        }
        // At the end of the 10^6 iterations, add the amount of non-overlaping intervals within index i interval set
        optimalResults[i] = selectedIntervals.size();
        System.out.println("selectedIntervals size is "+selectedIntervals.size());
    }
    for (int j = 0; j < optimalResults.length; j++){
        System.out.println("OPT - Conjunto "+j+": "+optimalResults[j]);
        System.out.println("OptimalResults has size "+optimalResults.length);
    }

  }

    /**
     *
     * @param interval
     * @param selectedSet
     * @return
     */
  private boolean isCompatible(Interval interval, ArrayList<Interval> selectedSet){
      if(interval == null){
          return false;
      }

      for(int i = 0; i < selectedSet.size(); i++){
          // Verifies if there's any overlap between the current interval and the selected intervals set
          if((interval.getFinalValue() < selectedSet.get(i).getFinalValue()) &&
                  (interval.getFinalValue() > selectedSet.get(i).getStartValue())) {
              return false;
          }
          if((interval.getStartValue() > selectedSet.get(i).getStartValue()) &&
                  (interval.getStartValue() < selectedSet.get(i).getFinalValue())) {
              return false;
          }
      }
      return true;
  }

    /**@
     * Method responsible for computing the maximum size set with no conflicts between the intervals. At the end of its
     * execution, returns a suboptimal solution.
     */
  public void subOptimalAlgorithm (){
      // Going through the set array, and computing, at every index, the optimal solution
      for(short i = 0; i < intervalSet.length; i++){//TODO O(n) [10 iterations]
          // ArrayList where the current selected intervals will be stored at each iteration of the first for loop
          ArrayList<Interval> selectedIntervals = new ArrayList<>();
          // A reference to the interval set at the index i in the reverse order (suboptimal sorting criteria)
          TreeSet<Interval> aux = (TreeSet<Interval>) intervalSet[i].descendingSet();
          // Iteration all 10^6 intervals and checking how many doesn't overlap for index i interval set
          for(Interval in : aux){ //TODO O(m) [10^6 iterations]
              /*
               * If the selected intervals array is empty, or the current interval doesn't overlap with any of
               * the intervals within it, then the current interval is added to it.
               */
              if(selectedIntervals.size() == 0 || isCompatible(in,selectedIntervals)){//TODO O(k) [10^6 iterations]
                  selectedIntervals.add(in);
              }
          }
          // At the end of the 10^6 iterations, add the amount of non-overlaping intervals within index i interval set
          subOptimalResults[i] = selectedIntervals.size();
      }
      for (int j = 0; j < subOptimalResults.length; j++){
          System.out.println("SUBOPT - Conjunto "+j+": "+subOptimalResults[j]);
          System.out.println("SubOptimalResults has size "+subOptimalResults.length);
      }
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


  public String callOptimalSolution(){
      optimalResults = new int[10];
      optimalAlgorithm();
      double avg = average(optimalResults);
      double stdDev = stdDeviation(optimalResults);
      return avg+";"+stdDev;
  }

  public String callSubOptimalSolution(){
      subOptimalResults = new int[10];
      subOptimalAlgorithm();
      double avg = average(subOptimalResults);
      double stdDev = stdDeviation(subOptimalResults);
      return avg+";"+stdDev;
  }
}
