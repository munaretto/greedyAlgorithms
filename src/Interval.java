

public class Interval implements Comparable<Interval> {
  private int startValue;
  private int finalValue;
  private boolean hasConflict;

  public Interval(int sv,int fv){
    startValue = sv;
    finalValue = fv;
    hasConflict = false;
  }

  public int getStartValue(){return startValue;}
  public int getFinalValue(){return finalValue;}
  public boolean hasConflict(){return hasConflict;}
  public void hasConflict(boolean newValue){this.hasConflict = newValue;}

  @Override
    public int compareTo(Interval i) {
      return finalValue - i.finalValue;
  }

}
