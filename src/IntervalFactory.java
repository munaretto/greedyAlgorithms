import java.util.TreeSet;

/**@
 * @author Guilherme Munaretto
 * @date 11/04/2018
 * This class was made to encapulate the process of creating new interval sets.
 */
public class IntervalFactory {
    private final int INICIAL_BEGINNING_TIME = 0;
    private final int INICIAL_ENDING_TIME = 999;
    private final int FINAL_BEGINNING_TIME = 1;
    private final int FINAL_ENDING_TIME = 1000;


    /**@
     * Constructor method, responsible for initializing the TreeSet.
     */
    public IntervalFactory(){

    }

    /**@
     * As the main method of this class, 'getIntervalSet' creates a TreeSet with 10^6 intervals between 0 and 1000;
     * @return a TreeSet containing 10^6 intervals between 0 and 1000;
     */
    public TreeSet<Interval> getIntervalSet(){
        TreeSet<Interval> intervalSet = new TreeSet<>();
        for(int i = 0; i < 1000000; i++){
            int start = (int) (Math.random()*(INICIAL_ENDING_TIME - INICIAL_BEGINNING_TIME)) + INICIAL_BEGINNING_TIME;
            int end = (int) (Math.random()*(FINAL_ENDING_TIME - FINAL_BEGINNING_TIME)) + FINAL_BEGINNING_TIME;

            while(start > end){
                end = (int) (Math.random()*(FINAL_ENDING_TIME - FINAL_BEGINNING_TIME)) + FINAL_BEGINNING_TIME;
            }
            intervalSet.add(new Interval(start,end));
        }
        for(Interval in : intervalSet){
            System.out.println("Inicio: "+in.getStartValue()+" | Fim: "+in.getFinalValue());
        }
        System.out.println("");
        return intervalSet;
    }
}
