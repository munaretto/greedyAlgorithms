public class Answer {
    private int[] results;
    private double average;
    private double stdDeviation;

    public Answer(int[] r, double avg, double stdDev){
        results = r;
        average = avg;
        stdDeviation = stdDev;
    }

    /**@
     *
     * @return
     */
    public int[] getResults() {
        return results;
    }

    /**@
     *
     * @return
     */
    public double getAverage() {
        return average;
    }

    /**
     *
     * @return
     */
    public double getStdDeviation() {
        return stdDeviation;
    }
}
